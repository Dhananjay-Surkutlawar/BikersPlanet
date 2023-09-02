using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class BikeColor
{
    public int Id { get; set; }

    public int BikeId { get; set; }

    public int ColorId { get; set; }

    public virtual Bike Bike { get; set; } = null!;

    public virtual Color Color { get; set; } = null!;
}
