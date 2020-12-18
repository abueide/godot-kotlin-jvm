extends "res://addons/gut/test.gd"


func test_no_arg_constructor_is_called() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.custom_name, "Idonthaveanyidea", "No arg constructor should be called")
	invocation_script.free()

func test_single_arg_constructor_is_called() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new("hello")
	assert_eq(invocation_script.custom_name, "hello", "String arg constructor should be called")
	invocation_script.free()
