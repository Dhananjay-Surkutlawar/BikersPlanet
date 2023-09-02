using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Login
{
    public int Id { get; set; }

    public string? Email { get; set; }

    public string? Password { get; set; }

    public int? RoleId { get; set; }

    public bool? StatusId { get; set; }

    public int? QId { get; set; }

    public string? Answer { get; set; }

    public virtual ICollection<Customer> Customers { get; set; } = new List<Customer>();

    public virtual ICollection<Dealer> Dealers { get; set; } = new List<Dealer>();

    public virtual Question? QIdNavigation { get; set; }

    public virtual CustomerType? Role { get; set; }

    public virtual ICollection<SubsriptionValidity> SubsriptionValidities { get; set; } = new List<SubsriptionValidity>();

    public virtual ICollection<Testride> Testrides { get; set; } = new List<Testride>();
}
