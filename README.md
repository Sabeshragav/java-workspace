# Java Notes

Note: OOPS

## Managing .class Files

### Previewing Files for Deletion

If you want to see what `.class` files would be deleted before actually deleting them, you can first run:

**Linux:**
```
find . -name "*.class" -type f
```

**PowerShell:**
```
Get-ChildItem -Path . -Include "*.class" -Recurse -File
```

### Deleting .class Files

To delete all `.class` files recursively in the current folder and its sub-folders, use this command:

**Linux:**
```
find . -name "*.class" -type f -delete
```

**PowerShell:**
```
Get-ChildItem -Path . -Include "*.class" -Recurse -File | Remove-Item
```