using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace BikersPlanet.Models;

public partial class BikerplanetautoicrementContext : DbContext
{
    public BikerplanetautoicrementContext()
    {
    }

    public BikerplanetautoicrementContext(DbContextOptions<BikerplanetautoicrementContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Admin> Admins { get; set; }

    public virtual DbSet<Admin1> Admins1 { get; set; }

    public virtual DbSet<Bike> Bikes { get; set; }

    public virtual DbSet<BikeCatogory> BikeCatogories { get; set; }

    public virtual DbSet<BikeColor> BikeColors { get; set; }

    public virtual DbSet<City> Cities { get; set; }

    public virtual DbSet<Color> Colors { get; set; }

    public virtual DbSet<Company> Companies { get; set; }

    public virtual DbSet<Customer> Customers { get; set; }

    public virtual DbSet<CustomerType> CustomerTypes { get; set; }

    public virtual DbSet<Dealer> Dealers { get; set; }

    public virtual DbSet<Login> Logins { get; set; }

    public virtual DbSet<Payment> Payments { get; set; }

    public virtual DbSet<Question> Questions { get; set; }

    public virtual DbSet<RatingBike> RatingBikes { get; set; }

    public virtual DbSet<RatingDealer> RatingDealers { get; set; }

    public virtual DbSet<SubscriptionPlan> SubscriptionPlans { get; set; }

    public virtual DbSet<SubsriptionValidity> SubsriptionValidities { get; set; }

    public virtual DbSet<Testride> Testrides { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
        => optionsBuilder.UseMySql("server=localhost;port=3306;user=root;password=Nikhil1998*;database=bikerplanetautoicrement", Microsoft.EntityFrameworkCore.ServerVersion.Parse("8.0.28-mysql"));

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder
            .UseCollation("utf8mb4_0900_ai_ci")
            .HasCharSet("utf8mb4");

        modelBuilder.Entity<Admin>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("admin");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Email)
                .HasMaxLength(255)
                .HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(255)
                .HasColumnName("name");
            entity.Property(e => e.Password)
                .HasMaxLength(255)
                .HasColumnName("password");
        });

        modelBuilder.Entity<Admin1>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("admins");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Email)
                .HasMaxLength(255)
                .HasColumnName("email");
            entity.Property(e => e.Name)
                .HasMaxLength(255)
                .HasColumnName("name");
            entity.Property(e => e.Password)
                .HasMaxLength(255)
                .HasColumnName("password");
        });

        modelBuilder.Entity<Bike>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("bikes");

            entity.HasIndex(e => e.BikeCatId, "bikecat_id_idx");

            entity.HasIndex(e => e.BikeCompanyId, "bikecom_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.BikeCatId).HasColumnName("bike_cat_id");
            entity.Property(e => e.BikeCompanyId).HasColumnName("bike_company_id");
            entity.Property(e => e.Fueltank)
                .HasMaxLength(255)
                .HasColumnName("fueltank");
            entity.Property(e => e.Kerbweight)
                .HasMaxLength(255)
                .HasColumnName("kerbweight");
            entity.Property(e => e.Mileage)
                .HasMaxLength(255)
                .HasColumnName("mileage");
            entity.Property(e => e.Name)
                .HasMaxLength(255)
                .HasColumnName("name");
            entity.Property(e => e.Price)
                .HasMaxLength(255)
                .HasColumnName("price");
            entity.Property(e => e.Seatheight)
                .HasMaxLength(255)
                .HasColumnName("seatheight");
            entity.Property(e => e.Transmission)
                .HasMaxLength(255)
                .HasColumnName("transmission");

            entity.HasOne(d => d.BikeCat).WithMany(p => p.Bikes)
                .HasForeignKey(d => d.BikeCatId)
                .HasConstraintName("bk_cat_id");

            entity.HasOne(d => d.BikeCompany).WithMany(p => p.Bikes)
                .HasForeignKey(d => d.BikeCompanyId)
                .HasConstraintName("bk_com_id");
        });

        modelBuilder.Entity<BikeCatogory>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("bike_catogories");

            entity.HasIndex(e => e.Id, "ID_UNIQUE").IsUnique();

            entity.HasIndex(e => e.BikeType, "Type_UNIQUE").IsUnique();

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.BikeType).HasColumnName("bike_type");
        });

        modelBuilder.Entity<BikeColor>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("bike_colors");

            entity.HasIndex(e => e.BikeId, "bi_id_idx");

            entity.HasIndex(e => e.ColorId, "cr_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.BikeId).HasColumnName("bike_id");
            entity.Property(e => e.ColorId).HasColumnName("color_id");

            entity.HasOne(d => d.Bike).WithMany(p => p.BikeColors)
                .HasForeignKey(d => d.BikeId)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("bi_id");

            entity.HasOne(d => d.Color).WithMany(p => p.BikeColors)
                .HasForeignKey(d => d.ColorId)
                .OnDelete(DeleteBehavior.ClientSetNull)
                .HasConstraintName("cr_id");
        });

        modelBuilder.Entity<City>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("cities");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CityName)
                .HasMaxLength(255)
                .HasColumnName("city_name");
        });

        modelBuilder.Entity<Color>(entity =>
        {
            entity.HasKey(e => e.ColorId).HasName("PRIMARY");

            entity.ToTable("colors");

            entity.Property(e => e.ColorId).HasColumnName("color_id");
            entity.Property(e => e.ColorName)
                .HasMaxLength(255)
                .HasColumnName("color_name");
        });

        modelBuilder.Entity<Company>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("companies");

            entity.HasIndex(e => e.CompanyName, "Company Name_UNIQUE").IsUnique();

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CompanyName).HasColumnName("company_name");
        });

        modelBuilder.Entity<Customer>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("customers");

            entity.HasIndex(e => e.CityId, "City_ID_idx");

            entity.HasIndex(e => e.Id, "ID_UNIQUE").IsUnique();

            entity.HasIndex(e => e.LoggerId, "LoggerID_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CityId).HasColumnName("city_id");
            entity.Property(e => e.Fname)
                .HasMaxLength(255)
                .HasColumnName("fname");
            entity.Property(e => e.Lname)
                .HasMaxLength(255)
                .HasColumnName("lname");
            entity.Property(e => e.LoggerId).HasColumnName("logger_id");

            entity.HasOne(d => d.City).WithMany(p => p.Customers)
                .HasForeignKey(d => d.CityId)
                .HasConstraintName("ci_id");

            entity.HasOne(d => d.Logger).WithMany(p => p.Customers)
                .HasForeignKey(d => d.LoggerId)
                .HasConstraintName("lo_id");
        });

        modelBuilder.Entity<CustomerType>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("customer_types");

            entity.HasIndex(e => e.Name, "name_UNIQUE").IsUnique();

            entity.Property(e => e.Id)
                .ValueGeneratedNever()
                .HasColumnName("id");
            entity.Property(e => e.Name).HasColumnName("name");
        });

        modelBuilder.Entity<Dealer>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("dealers");

            entity.HasIndex(e => e.Company, "cd_id_idx");

            entity.HasIndex(e => e.DCity, "cit_id_idx");

            entity.HasIndex(e => e.LogId, "log_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.AddressDealer)
                .HasMaxLength(255)
                .HasColumnName("address_dealer");
            entity.Property(e => e.Company).HasColumnName("company");
            entity.Property(e => e.DCity).HasColumnName("d_city");
            entity.Property(e => e.LogId).HasColumnName("log_id");
            entity.Property(e => e.MobileNo)
                .HasMaxLength(255)
                .HasColumnName("mobile_no");
            entity.Property(e => e.OwnerName)
                .HasMaxLength(255)
                .HasColumnName("owner_name");

            entity.HasOne(d => d.CompanyNavigation).WithMany(p => p.Dealers)
                .HasForeignKey(d => d.Company)
                .HasConstraintName("com_id");

            entity.HasOne(d => d.DCityNavigation).WithMany(p => p.Dealers)
                .HasForeignKey(d => d.DCity)
                .HasConstraintName("cit_id");

            entity.HasOne(d => d.Log).WithMany(p => p.Dealers)
                .HasForeignKey(d => d.LogId)
                .HasConstraintName("log_id");
        });

        modelBuilder.Entity<Login>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("logins");

            entity.HasIndex(e => e.QId, "que_id_idx");

            entity.HasIndex(e => e.RoleId, "ro_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Answer)
                .HasMaxLength(255)
                .HasColumnName("answer");
            entity.Property(e => e.Email)
                .HasMaxLength(255)
                .HasColumnName("email");
            entity.Property(e => e.Password)
                .HasMaxLength(255)
                .HasColumnName("password");
            entity.Property(e => e.QId).HasColumnName("q_id");
            entity.Property(e => e.RoleId).HasColumnName("role_id");
            entity.Property(e => e.StatusId).HasColumnName("status_id");

            entity.HasOne(d => d.QIdNavigation).WithMany(p => p.Logins)
                .HasForeignKey(d => d.QId)
                .HasConstraintName("que_id");

            entity.HasOne(d => d.Role).WithMany(p => p.Logins)
                .HasForeignKey(d => d.RoleId)
                .HasConstraintName("ro_id");
        });

        modelBuilder.Entity<Payment>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("payments");

            entity.HasIndex(e => e.DealerId, "dp_id_idx");

            entity.HasIndex(e => e.SubPlanId, "sp_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CardNo)
                .HasMaxLength(16)
                .HasColumnName("card_no");
            entity.Property(e => e.CvvNo)
                .HasMaxLength(3)
                .HasColumnName("cvv_no");
            entity.Property(e => e.DealerId).HasColumnName("dealer_id");
            entity.Property(e => e.SubPlanId).HasColumnName("sub_plan_id");

            entity.HasOne(d => d.Dealer).WithMany(p => p.Payments)
                .HasForeignKey(d => d.DealerId)
                .HasConstraintName("dp_id");

            entity.HasOne(d => d.SubPlan).WithMany(p => p.Payments)
                .HasForeignKey(d => d.SubPlanId)
                .HasConstraintName("sp_id");
        });

        modelBuilder.Entity<Question>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("questions");

            entity.HasIndex(e => e.Question1, "Question_UNIQUE").IsUnique();

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Question1).HasColumnName("question");
        });

        modelBuilder.Entity<RatingBike>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("rating_bikes");

            entity.HasIndex(e => e.BId, "br_id_idx");

            entity.HasIndex(e => e.CustomerId, "cusra_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.BId).HasColumnName("b_id");
            entity.Property(e => e.CustomerId).HasColumnName("customer_id");
            entity.Property(e => e.Rating).HasColumnName("rating");

            entity.HasOne(d => d.BIdNavigation).WithMany(p => p.RatingBikes)
                .HasForeignKey(d => d.BId)
                .HasConstraintName("br_id");

            entity.HasOne(d => d.Customer).WithMany(p => p.RatingBikes)
                .HasForeignKey(d => d.CustomerId)
                .HasConstraintName("cusra_id");
        });

        modelBuilder.Entity<RatingDealer>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("rating_dealers");

            entity.HasIndex(e => e.CId, "custo_id_idx");

            entity.HasIndex(e => e.DId, "deal_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.CId).HasColumnName("c_id");
            entity.Property(e => e.DId).HasColumnName("d_id");
            entity.Property(e => e.Rating)
                .HasPrecision(4, 1)
                .HasColumnName("rating");

            entity.HasOne(d => d.CIdNavigation).WithMany(p => p.RatingDealers)
                .HasForeignKey(d => d.CId)
                .HasConstraintName("custo_id");

            entity.HasOne(d => d.DIdNavigation).WithMany(p => p.RatingDealers)
                .HasForeignKey(d => d.DId)
                .HasConstraintName("deal_id");
        });

        modelBuilder.Entity<SubscriptionPlan>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("subscription_plans");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Details)
                .HasMaxLength(255)
                .HasColumnName("details");
            entity.Property(e => e.Price)
                .HasPrecision(6)
                .HasColumnName("price");
        });

        modelBuilder.Entity<SubsriptionValidity>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("subsription_validities");

            entity.HasIndex(e => e.LogginId, "deal_log_id_idx");

            entity.HasIndex(e => e.PlanId, "pl_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.FromDate).HasColumnName(" from_date");
            entity.Property(e => e.LogginId).HasColumnName("loggin_id");
            entity.Property(e => e.PlanId).HasColumnName("plan_id");
            entity.Property(e => e.UpTO).HasColumnName("up_tO");

            entity.HasOne(d => d.Loggin).WithMany(p => p.SubsriptionValidities)
                .HasForeignKey(d => d.LogginId)
                .HasConstraintName("deal_log_id");

            entity.HasOne(d => d.Plan).WithMany(p => p.SubsriptionValidities)
                .HasForeignKey(d => d.PlanId)
                .HasConstraintName("pl_id");
        });

        modelBuilder.Entity<Testride>(entity =>
        {
            entity.HasKey(e => e.Id).HasName("PRIMARY");

            entity.ToTable("testrides");

            entity.HasIndex(e => e.LoggerId, "FKfae6lkfugp55hl0u9cpbaml4q");

            entity.HasIndex(e => e.BikeId, "b_id_idx");

            entity.HasIndex(e => e.DealerId, "d_id_idx");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.BikeId).HasColumnName("bike_id");
            entity.Property(e => e.Date)
                .HasMaxLength(255)
                .HasColumnName("date");
            entity.Property(e => e.DealerId).HasColumnName("dealer_id");
            entity.Property(e => e.LoggerId).HasColumnName("logger_id");
            entity.Property(e => e.RideStatus).HasColumnName("ride_status");

            entity.HasOne(d => d.Bike).WithMany(p => p.Testrides)
                .HasForeignKey(d => d.BikeId)
                .HasConstraintName("b_id");

            entity.HasOne(d => d.Dealer).WithMany(p => p.Testrides)
                .HasForeignKey(d => d.DealerId)
                .HasConstraintName("d_id");

            entity.HasOne(d => d.Logger).WithMany(p => p.Testrides)
                .HasForeignKey(d => d.LoggerId)
                .HasConstraintName("FKfae6lkfugp55hl0u9cpbaml4q");
        });

        OnModelCreatingPartial(modelBuilder);
    }

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
