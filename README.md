# DnD

```Project based on a Dungeon and Dragons game.
At the moment, the main, upper in the hierarchy, and a package "Personnages" which is being implemented
in order to create characters and add them to an arraylist.
```
## Package "Personnages" :
```The Character Class is abstract and allows to instantiate either subclass
Warrior or Wizard. An option to edit/remove some characters and their attributes
is available (name, equipment, accessory). The package "Personnages" also deals with
the characters' equipment and generates their random attributes.
```
### Warrior/Wizard Classes
```Used to instantiate a Warrior or Wizard character, creating its getters & setters plus
own methods for personnalised short and detailed presentations. uses super("params
from abstract Character") and adds own specialties.
```
### NewChar Class
```Loops creating either Warrior or Wizard upon user's choice.
Try/catch deal with exceptions. Methods have been extracted to generate paramaters,
instantiate character and be called from modify if needed (createWarrior(), createWizard()).
So have selectWeapon & selectSpell.
```

### ModifChar Class
```Includes several methods to present and allow acces to Some attributes of
every character in the list as follows :
 - modification() : orchestrates calling of all other methods (offers menu and executes choices).
 - selectIndex()  : shows list of short names along with characters' indexes for
direct access of altering methods.
 - changeName()   : changes name. obviously.
 - modifyW*()     : redefines attributes equipment(either weapon or spell) and accessory String.
```

### Stuff Class
```Superclass of Weapon & Spell for them to be treated the same way by the characters of
super method attack for instance allows to have 2 separate libraries regarding the type of
equipment the characters uses. Has getters for damage & name.
```

#### Weapon / Spell Classes
```Extends Stuff
Instantiates the library of items it's got. Either Weapons or Spells along with their descriptions.
Private attributes reachable through Stuff Getter.
```

# Coming next : 
 - interface with a bunch of meaningful consts and inclusion of create and modify character fonctions.
 - DB to save the list of characters.
 - GUI.
 - and much more..
 
