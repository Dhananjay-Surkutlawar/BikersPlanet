using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Company
{
    public int Id { get; set; }

    public string? CompanyName { get; set; }

    public virtual ICollection<Bike> Bikes { get; set; } = new List<Bike>();

    public virtual ICollection<Dealer> Dealers { get; set; } = new List<Dealer>();
}
