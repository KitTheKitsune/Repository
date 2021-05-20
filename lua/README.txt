useful lua keywords/statements--
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
      
      
lua i/o library:

    files can be opened via the io.open function:
        
        FILE_VARIABLE = io.open(FILE_NAME [, MODE]) --[] content is optional
        
      file opening modes include:
        {"r", "w", "a", "r+", "w+", "a+"}
        
    files can be read via:
    
        local VARIABLE = io.read() --reads the contents of the file line-wise
        
    files must be closed via:
        
        io.close(FILE_VARIABLE)
        
        
error handling:

    to prevent crashing of the program functions should be called via pcall or xpcall:
        pcall returns the status of the function
        xpcall allows you to set how the error is handled
        
        e.g.
            function FUNCTION()
                --STATEMENTS
            end

            function ERROR_HANDLER( err )
                --WHAT TO DO WITH ERROR
            end

            if pcall(FUNCTION) then
                --ON SUCCESS
            end

            print(xpcall(FUNCTION, ERROR_HANDLER))
