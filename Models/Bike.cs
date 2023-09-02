using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Bike
{
    public int Id { get; set; }

    public string? Name { get; set; }

    public int? BikeCompanyId { get; set; }

    public int? BikeCatId { get; set; }

    public string? Mileage { get; set; }

    public string? Transmission { get; set; }

    public string? Kerbweight { get; set; }

    public string? Fueltank { get; set; }

    public string? Seatheight { get; set; }

    public string? Price { get; set; }

    public virtual BikeCatogory? BikeCat { get; set; }

    public virtual ICollection<BikeColor> BikeColors { get; set; } = new List<BikeColor>();

    public virtual Company? BikeCompany { get; set; }

    public virtual ICollection<RatingBike> RatingBikes { get; set; } = new List<RatingBike>();

    public virtual ICollection<Testride> Testrides { get; set; } = new List<Testride>();
}
