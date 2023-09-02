using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using BikersPlanet.Models;

namespace BikersPlanet.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TestridesController : ControllerBase
    {
        private readonly BikerplanetautoicrementContext _context;

        public TestridesController(BikerplanetautoicrementContext context)
        {
            _context = context;
        }

        // GET: api/Testrides
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Testride>>> GetTestrides()
        {
          if (_context.Testrides == null)
          {
              return NotFound();
          }
            return await _context.Testrides.ToListAsync();
        }

        // GET: api/Testrides/5
        [HttpGet("{id}")]
        public async Task<ActionResult<Testride>> GetTestride(int id)
        {
          if (_context.Testrides == null)
          {
              return NotFound();
          }
            var testride = await _context.Testrides.FindAsync(id);

            if (testride == null)
            {
                return NotFound();
            }

            return testride;
        }

        // PUT: api/Testrides/5
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPut("{id}")]
        public async Task<IActionResult> PutTestride(int id, Testride testride)
        {
            if (id != testride.Id)
            {
                return BadRequest();
            }

            _context.Entry(testride).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!TestrideExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }

        // POST: api/Testrides
        // To protect from overposting attacks, see https://go.microsoft.com/fwlink/?linkid=2123754
        [HttpPost]
        public async Task<ActionResult<Testride>> PostTestride(Testride testride)
        {
          if (_context.Testrides == null)
          {
              return Problem("Entity set 'BikerplanetautoicrementContext.Testrides'  is null.");
          }
            _context.Testrides.Add(testride);
            await _context.SaveChangesAsync();

            return CreatedAtAction("GetTestride", new { id = testride.Id }, testride);
        }

        // DELETE: api/Testrides/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteTestride(int id)
        {
            if (_context.Testrides == null)
            {
                return NotFound();
            }
            var testride = await _context.Testrides.FindAsync(id);
            if (testride == null)
            {
                return NotFound();
            }

            _context.Testrides.Remove(testride);
            await _context.SaveChangesAsync();

            return NoContent();
        }

        private bool TestrideExists(int id)
        {
            return (_context.Testrides?.Any(e => e.Id == id)).GetValueOrDefault();
        }
    }
}
