//FILE:a.kt
//KT-1080 Don't use previously imported packages while resolving import references

package kt1080

import reflect.Constructor

import b.*
import d
import d.Test
import b.d

class Some: <!OTHER_ERROR, OTHER_ERROR, OTHER_ERROR!>Test<!>()

//FILE:b.kt

package b.d

public open class Test