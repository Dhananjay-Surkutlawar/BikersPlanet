using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class City
{
    public int Id { get; set; }

    public string? CityName { get; set; }

    public virtual ICollection<Customer> Customers { get; set; } = new List<Customer>();

    public virtual ICollection<Dealer> Dealers { get; set; } = new List<Dealer>();
}
