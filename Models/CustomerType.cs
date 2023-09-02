using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class CustomerType
{
    public int Id { get; set; }

    public string? Name { get; set; }

    public virtual ICollection<Login> Logins { get; set; } = new List<Login>();
}
