# BootJarDemo
Simple showcase to illustrate differences between bootrun and bootjar in Springboot 2.3.X and newer versions

# Repo organization
## Boot23
Springboot 2.3.12 project with an additional sourceSet `second`. `second` output are included in `main` compile and
runtime classpath.
It works as described in Spring boot gradle plugin documentation, `second .class` files are included in 
`BOOT-INF/classes` folder of the bootjar archive. Bootrun task launch the application.
## Boot24
Springboot 2.4.0 project with an additional sourceSet `second`. `second` output are included in `main` compile and
runtime classpath.
Output of `second` sourceSet is missing in the bootjar archive, bootrun complains about ClassNotFoundException with 
`second` sourceSet class.