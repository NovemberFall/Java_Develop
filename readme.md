# How to generate a void method in IntelliJ IDEA?
- enter "psvm"

```ruby
find . -name .DS_Store -print0 | xargs -0 git rm -f --ignore-unmatch

echo .DS_Store >> .gitignore

touch .gitignore
git add .gitignore
git commit -m '.DS_Store banished!'
```