using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class BikeCatogory
{
    public int Id { get; set; }

    public string? BikeType { get; set; }

    public virtual ICollection<Bike> Bikes { get; set; } = new List<Bike>();
}
