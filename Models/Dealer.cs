using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Dealer
{
    public int Id { get; set; }

    public string? OwnerName { get; set; }

    public int? Company { get; set; }

    public int? DCity { get; set; }

    public string? AddressDealer { get; set; }

    public int? LogId { get; set; }

    public string? MobileNo { get; set; }

    public virtual Company? CompanyNavigation { get; set; }

    public virtual City? DCityNavigation { get; set; }

    public virtual Login? Log { get; set; }

    public virtual ICollection<Payment> Payments { get; set; } = new List<Payment>();

    public virtual ICollection<RatingDealer> RatingDealers { get; set; } = new List<RatingDealer>();

    public virtual ICollection<Testride> Testrides { get; set; } = new List<Testride>();
}
