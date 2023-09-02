using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class RatingBike
{
    public int Id { get; set; }

    public int? BId { get; set; }

    public int? CustomerId { get; set; }

    public double? Rating { get; set; }

    public virtual Bike? BIdNavigation { get; set; }

    public virtual Customer? Customer { get; set; }
}
