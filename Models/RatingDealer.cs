using System;
using System.Collections.Generic;

namespace BikersPlanet.Models;

public partial class RatingDealer
{
    public int Id { get; set; }

    public int? DId { get; set; }

    public int? CId { get; set; }

    public decimal? Rating { get; set; }

    public virtual Customer? CIdNavigation { get; set; }

    public virtual Dealer? DIdNavigation { get; set; }
}
