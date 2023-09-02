using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Payment
{
    public int Id { get; set; }

    public int? DealerId { get; set; }

    public int? SubPlanId { get; set; }

    public string? CardNo { get; set; }

    public string? CvvNo { get; set; }

    public virtual Dealer? Dealer { get; set; }

    public virtual SubscriptionPlan? SubPlan { get; set; }
}
