# helper procedures ----------------------------------------------

def expand(template, database):
    return template

# main program ---------------------------------------------------

template_filename = 'template.txt'
template_file     = open(template_filename, 'r')
template          = template_file.read()

database = {
    "name"        : "Chris", \
    "value"       : 10000,   \
    "taxed_value" : 10000 - 10000 * 0.4, \
    "in_CA"       : False    \
}

# Write the expand function to enable this line:
result = expand(template, database)
print(result)

