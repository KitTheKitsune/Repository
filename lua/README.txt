useful lua keywords/statements:
require --Implements a lua module
    calling a method in a module can be done in three unique ways e.g. 
      require "MODULE_NAME"
      MODULE_NAME.METHOD_NAME()

      local VARIABLE = require "MODULE_NAME"
      VARIABLE.METHOD_NAME()

      require "MODULE_NAME"
      local VARIABLE = MODULE_NAME.METHOD_NAME
      VARIABLE()
        
a minimal module is written as:
    local MODULE_NAME = {}
    
    --METHODS
    
    return MODULE_NAME
    
    
metatables:
    setting the meta table of a table can be written as:
    
      local TABLE_VARIABLE = setmetatable(TABLE, METATABLE)
      
    metatables contain metamethods that can alter the behavior of different operators
    defined meta-methods include but are not limited to:
          {_add, _sub, _mul, _div, _mod, _unm, _concat, _eq, _lt, _le, _call, _tostring}
    e.g.
      _add = function(THIS_TABLE, OTHER_TABLE)
        
        --METHOD_STATEMENTS
        
      end
      
      
