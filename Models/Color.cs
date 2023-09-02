using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Color
{
    public int ColorId { get; set; }

    public string? ColorName { get; set; }

    public virtual ICollection<BikeColor> BikeColors { get; set; } = new List<BikeColor>();
}
