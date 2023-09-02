using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Customer
{
    public int Id { get; set; }

    public string? Fname { get; set; }

    public string? Lname { get; set; }

    public int? CityId { get; set; }

    public int? LoggerId { get; set; }

    public virtual City? City { get; set; }

    public virtual Login? Logger { get; set; }

    public virtual ICollection<RatingBike> RatingBikes { get; set; } = new List<RatingBike>();

    public virtual ICollection<RatingDealer> RatingDealers { get; set; } = new List<RatingDealer>();
}
