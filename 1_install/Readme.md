## Install

- ubuntu
- コマンドラインからやりたい
- SDKMAN を使うのが良いらしい...

`kotlinc` コマンドがコンパイラ

- 拡張子 `kt`
- `-d xxx.jar` 出力先
- `-include-runtime`: 作った .jar を `java` コマンドで runnable にするために必要(?)
  - これがないときは `kotlin -classpath xxx.jar <main class name>` で実行可能っぽい

`kotlinc-jvm` が REPL

`kts` 拡張子のスクリプト形式がある

- `kotlinc -script <file> -- <args for script>`
- main 関数不要
- args 変数が定義済み？
