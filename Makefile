.PHONY: run-dist checkstyle

run-dist:
	$(MAKE) -C app run-dist

checkstyle:
	$(MAKE) -C app checkstyle