using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class SubsriptionValidity
{
    public int Id { get; set; }

    public int? PlanId { get; set; }

    public DateOnly? FromDate { get; set; }

    public DateOnly? UpTO { get; set; }

    public int? LogginId { get; set; }

    public virtual Login? Loggin { get; set; }

    public virtual SubscriptionPlan? Plan { get; set; }
}
