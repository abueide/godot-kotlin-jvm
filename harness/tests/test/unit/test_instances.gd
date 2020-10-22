extends "res://addons/gut/test.gd"


func test_instances_keep_value_when_parameter():
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	var instance_id = invocation_script.jvm_instance_id
	assert_eq(invocation_script.other_jvm_instance_id(invocation_script), instance_id, "JVM instance should be the same.")
	invocation_script.free()
