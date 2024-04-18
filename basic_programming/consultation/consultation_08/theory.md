## Ветвления в Git
Ветвление в Git позволяет разработчикам изолированно работать над новыми функциями или исправлениями, не влияя на основную кодовую базу.
Это ключевая особенность, которая делает Git мощным инструментом для командной разработки.
Вот основы и шаги для работы в команде над одним проектом с использованием веток в Git.

### Основы ветвления в Git

**Ветки** в Git — это просто указатели на определенные коммиты.
Когда вы создаете новую ветку, Git создает новый указатель, который можно перемещать независимо от других веток.

- **`master` или `main` ветка**: Традиционно основная ветка, где хранится стабильная версия проекта.
- **Функциональные ветки (Feature branches)**: Используются для разработки новых функций или исправлений, обычно одна ветка на функцию или исправление.
- **Ветки исправлений (Hotfix branches)**: Для срочных исправлений в основной кодовой базе.

## git branch
Работа с ветками в репозитории

- `git branch` - показывает список веток
- `git branch branch-name` - создает новую ветку branch-name
- `git branch -D branch-name` — удаляет ветку branch-name
- `git checkout` - Переключается на другую ветку
- `git checkout branch-name` — переключается на последний коммит в ветке branch-name
- `git checkout -b branch-name` - создает и переключается на ветку branch-name

Переименование ветки в Git зависит от того, находитесь ли вы в этой ветке или хотите переименовать другую ветку.
- `git branch -m new-branch-name` - переименование текущей ветки
- `git branch -m old-branch-name new-branch-name` - переименовать ветку, находясь в другой ветке
- `git push origin -u branch-name` - Отправить новую ветку в удалённый репозиторий и установите её как upstream
- `git push origin --delete branch-name` - Удалить ветку из удалённого репозитория

--- 

Разберем две основные модели совместной разработки в контексте использования Git и GitHub (или аналогичных систем управления версиями и платформ):
- **модель с общим репозиторием** (Shared-repository model)
- **модель с форками и пулл-реквестами** (Forks and Pull Requests model).

Обе модели имеют свои преимущества и недостатки и подходят для разных сценариев работы.

### 1. Модель с общим репозиторием (Shared-repo model)

В этой модели все участники команды имеют прямой доступ на запись в один общий репозиторий. Они могут клонировать репозиторий, создавать новые ветки, делать коммиты и пушить изменения напрямую в общий репозиторий.

**Когда лучше использовать:**
- В небольших командах, где все разработчики знакомы друг с другом и доверяют друг другу.
- В приватных проектах или организациях, где управление доступом строго контролируется.
- Когда нужна простота управления и меньше оверхеда с настройкой доступов.

**Преимущества:**
- Простота и быстрота внесения изменений, не требуется создавать форки.
- Удобно для небольших команд, где требуется тесное взаимодействие и быстрая итерация.

**Недостатки:**
- Больший риск случайного повреждения основной ветки (`main` или `master`), особенно без строгих правил ревью кода.
- Требуется доверие между всеми участниками команды, так как каждый имеет полный доступ.

### 2. Модель с форками и пулл-реквестами (Forks and Pull Requests model)

В этой модели участники не имеют прямого доступа на запись в основной репозиторий.
Вместо этого они создают свои собственные копии (форки) репозитория, работают в этих форках, а затем предлагают свои изменения через пулл-реквесты.

**Когда лучше использовать:**
- В проектах с открытым исходным кодом, где участвует широкий круг незнакомых разработчиков.
- Когда необходим строгий контроль над изменениями в основном репозитории.
- Для обеспечения код-ревью и обсуждения изменений перед их внедрением.

**Преимущества:**
- Высокий уровень контроля за качеством и безопасностью кода.
- Возможность широкого обсуждения и рецензирования изменений перед их принятием.
- Безопасность основного репозитория от случайных повреждений.

**Недостатки:**
- Больше шагов для внесения изменений (нужно создать форк, поддерживать его в актуальном состоянии, создавать пулл-реквесты).
- Может быть менее удобно для небольших команд или проектов, где все разработчики доверяют друг другу и хорошо знакомы с процессами.

В целом, выбор между этими моделями зависит от размера команды, типа проекта (открытый или закрытый), необходимости контроля над изменениями и предпочтений в работе.

---

## Общий порядок (схема) работы в режиме с доступом на запись

1. Открыть имеющийся репо (или создать новый)
2. Добавить членов команды
3. Настройка защиты ветки `main`
4. Клонировать репо (скачать на компьютер)
5. Открыть репо любимом редакторе
6. Создать отдельную ветку под задачу
    - `git checkout -b новая_ветка main`
    - `git checkout -b sergey/create-hello-file main`
7. Решаем задачу (вносим правки в проект)
8. Фиксация изменений
    - `git add .`
    - `git commit -m 'update'`
9. Выгрузить ветку (изменения) на GitHub
    - `git push -u origin ветка`
10. Оформить “заявку на улучшение” (Pull Request, PR, запрос на слияние)
11. **(доп/шаг)** Выгрузить изменения с GitHub себе на компьютер
    1. переключиться на `main`
    2. `git pull`


---

2. Добавление
   Settings -> Collaborators -> Add people -> добавляем почты или идентификаторы
   На почту приходит приглашение - вы его принимаете и готово
3. Защита основной ветки
   Settings -> Branches -> Add Branch protection rule
   Branch name pattern -> вписываем main или master - название вашей ветки
   Require a pull request before merging -> ставим галочку. Делать проверку всех изменений
    - Require approvals - сколько одобрений нужно для записи
      Теперь можно клонировать репозиторий git ch

12. **Удаление ветки после слияния**
- После успешного слияния и проверки, что все работает как ожидается, удалите функциональную ветку.
   ```
   git branch -d feature-branch-name
   ```
- удалить ветку в удаленном репозитории
   ```
   git push -delete origin feature-branch-name
   ```






---


### Как работать в команде с использованием веток

1. **Планирование работы**
    - Определите задачи и назначьте их разработчикам.
    - Каждая задача должна быть выполнена в отдельной функциональной ветке.

2. **Создание новой ветки**
    - Перед началом работы над задачей создайте новую ветку из актуального состояния основной ветки (`main` или `master`).
   ```bash
   git checkout -b feature-branch-name
   ```

3. **Разработка и коммиты**
    - Работайте над задачей в вашей ветке, делайте коммиты, чтобы сохранять прогресс.
   ```bash
   git add .
   git commit -m "Описание изменений"
   ```

4. **Обновление локальной ветки с основной веткой**
    - Регулярно обновляйте свою ветку последними изменениями из основной ветки (`main` или `master`), чтобы избежать конфликтов при слиянии.
   ```bash
   git checkout main
   git pull
   git checkout feature-branch-name
   git merge main
   ```

5. **Решение конфликтов**
    - Если возникают конфликты при слиянии, их нужно разрешить вручную, обновив код и сделав новый коммит.

6. **Code Review и слияние веток**
    - После завершения работы отправьте Pull Request (PR) / Merge Request (MR) в основную ветку.
    - Команда или назначенный рецензент должен проверить код перед слиянием.
    - После одобрения PR/MR сливайте ветку с основной веткой.

7. **Удаление ветки после слияния**
    - После успешного слияния и проверки, что все работает как ожидается, удалите функциональную ветку.
   ```bash
   git branch -d feature-branch-name
   ```

8. **Поддержание чистоты репозитория**
    - Регулярно обновляйтесь и удаляйте ненужные ветки, чтобы поддерживать репозиторий в порядке.

Эти шаги помогут вашей команде эффективно сотрудничать над проектом, используя Git и ветвление.
Практика работы с ветками улучшает процесс разработки, позволяя разработчикам работать параллельно над разными задачами без риска нарушения стабильности основной кодовой базы.

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>




## Branching in Git
Branching in Git allows developers to work on new features or fixes in isolation, without affecting the main codebase.
This is a key feature that makes Git a powerful tool for team development.
Here are the basics and steps for working as a team on a single project using branches in Git.

### Basics of Branching in Git

**Branches** in Git are simply pointers to specific commits.
When you create a new branch, Git creates a new pointer that can be moved independently of other branches.

- **`master` or `main` branch**: Traditionally the main branch, where the stable version of the project is stored.
- **Feature branches**: Used for developing new features or fixes, usually one branch per feature or fix.
- **Hotfix branches**: For urgent fixes in the main codebase.

## git branch
Working with branches in the repository

- `git branch` - shows the list of branches
- `git branch branch-name` - creates a new branch named branch-name
- `git branch -D branch-name` — deletes the branch named branch-name
- `git checkout` - switches to another branch
- `git checkout branch-name` — switches to the last commit in the branch named branch-name
- `git checkout -b branch-name` - creates and switches to the branch named branch-name

Renaming a branch in Git depends on whether you are in that branch or want to rename another branch.
- `git branch -m new-branch-name` - renames the current branch
- `git branch -m old-branch-name new-branch-name` - rename a branch while in another branch
- `git push origin -u branch-name` - Push the new branch to the remote repository and set it as upstream
- `git push origin --delete branch-name` - Delete the branch from the remote repository

--- 

Let's examine two main collaborative development models in the context of using Git and GitHub (or similar version control systems and platforms):
- **Shared-repository model**
- **Forks and Pull Requests model**.

Both models have their advantages and disadvantages and are suitable for different working scenarios.

### 1. Shared-repository model

In this model, all team members have direct write access to a single shared repository. They can clone the repository, create new branches, make commits, and push changes directly to the shared repository.

**When to use:**
- In small teams, where all developers know each other and trust each other.
- In private projects or organizations where access control is strictly managed.
- When simplicity of management and less overhead with access setup are needed.

**Advantages:**
- Simplicity and speed of making changes, no need to create forks.
- Convenient for small teams where close interaction and quick iteration are required.

**Disadvantages:**
- Higher risk of accidental damage to the main branch (`main` or `master`), especially without strict code review rules.
- Requires trust among all team members, as everyone has full access.

### 2. Forks and Pull Requests model

In this model, participants do not have direct write access to the main repository.
Instead, they create their own copies (forks) of the repository, work in these forks, and then propose their changes through pull requests.

**When to use:**
- In open-source projects involving a wide range of unfamiliar developers.
- When strict control over changes in the main repository is necessary.
- To ensure code review and discussion of changes before their implementation.

**Advantages:**
- High level of control over code quality and security.
- The opportunity for broad discussion and review of changes before their acceptance.
- Security of the main repository from accidental damage.

**Disadvantages:**
- More steps to make changes (need to create a fork, keep it up to date, create pull requests).
- May be less convenient for small teams or projects where all developers trust each other and are familiar with the processes.

Overall, the choice between these models depends on the size of the team, the type of project (open or closed), the need for control over changes, and work preferences.

---

## General workflow (scheme) with write access

1. Open an existing repo (or create a new one)
2. Add team members
3. Set up `main` branch protection
4. Clone the repo (download to computer)
5. Open the repo in your favorite editor
6. Create a separate branch for the task
    - `git checkout -b new_branch main`
    - `git checkout -b sergey/create-hello-file main`
7. Solve the task (make changes to the project)
8. Commit changes
    - `git add .`
    - `git commit -m 'update'`
9. Upload the branch (changes) to GitHub
    - `git push -u origin branch`
10. Submit a “Pull Request” (PR, merge

 request)
11. **(additional step)** Download changes from GitHub to your computer
    1. switch to `main`
    2. `git pull`


---

### How to work as a team using branches

1. **Planning the work**
    - Define tasks and assign them to developers.
    - Each task should be completed in a separate feature branch.

2. **Creating a new branch**
    - Before starting work on a task, create a new branch from the current state of the main branch (`main` or `master`).
   ```bash
   git checkout -b feature-branch-name
   ```

3. **Development and commits**
    - Work on the task in your branch, make commits to save progress.
   ```bash
   git add .
   git commit -m "Description of changes"
   ```

4. **Updating the local branch with the main branch**
    - Regularly update your branch with the latest changes from the main branch (`main` or `master`) to avoid conflicts during merging.
   ```bash
   git checkout main
   git pull
   git checkout feature-branch-name
   git merge main
   ```

5. **Resolving conflicts**
    - If conflicts arise during merging, they need to be resolved manually by updating the code and making a new commit.

6. **Code Review and merging branches**
    - After completing the work, send a Pull Request (PR) / Merge Request (MR) to the main branch.
    - The team or assigned reviewer should check the code before merging.
    - After approval, merge the branch with the main branch.

7. **Deleting the branch after merging**
    - After successful merging and verifying that everything works as expected, delete the feature branch.
   ```bash
   git branch -d feature-branch-name
   ```

8. **Maintaining repository cleanliness**
    - Regularly update and delete unnecessary branches to keep the repository in order.

These steps will help your team effectively collaborate on a project using Git and branching.
The practice of working with branches improves the development process, allowing developers to work parallel on different tasks without risking the stability of the main codebase.


</details>
