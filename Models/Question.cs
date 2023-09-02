using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class Question
{
    public int Id { get; set; }

    public string? Question1 { get; set; }

    public virtual ICollection<Login> Logins { get; set; } = new List<Login>();
}
