# gradle でビルド

## gradle 入門

<https://gradle.org/>

プロジェクト作成 <https://guides.gradle.org/creating-new-gradle-builds/#initialize_a_project>

- groovy, kotlin ２種類の DSL がある
- `gradle init` でいろいろ聞かれる
  - gradlew は実行のためのラッパー
  - `gradlew <task>` で build.gradle で定義した `<task>` が実行できる
- init 時に type を選ぶことで、java maven とか、kotlin JVM とかテンプレ生成できる
- 依存関係は run すると勝手にとってきてくれるらしい
