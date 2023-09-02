using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Testride
{
    public int Id { get; set; }

    public int? DealerId { get; set; }

    public int? BikeId { get; set; }

    public string? Date { get; set; }

    public int? LoggerId { get; set; }

    public int? RideStatus { get; set; }

    public virtual Bike? Bike { get; set; }

    public virtual Dealer? Dealer { get; set; }

    public virtual Login? Logger { get; set; }
}
