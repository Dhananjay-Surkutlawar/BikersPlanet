using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class SubscriptionPlan
{
    public int Id { get; set; }

    public string? Details { get; set; }

    public decimal? Price { get; set; }

    public virtual ICollection<Payment> Payments { get; set; } = new List<Payment>();

    public virtual ICollection<SubsriptionValidity> SubsriptionValidities { get; set; } = new List<SubsriptionValidity>();
}
