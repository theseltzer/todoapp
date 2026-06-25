# TodoApp (Learning Project)

## What this is
A simple single-screen Android to-do app: type a task, hit Add, see it in a list,
delete it when done. Built as the second learning project after the flashlight app.

## About me
- Junior dev. Comfortable with general programming concepts (variables,
  functions, OOP, control flow) in other languages.
- Completed: flashlight app (CameraManager, toggle button, XML layout).
- New concepts in this project: RecyclerView, Adapter, ViewHolder pattern.
- Do not assume I know Android-specific vocabulary. If you use a new term,
  define it in one sentence the first time you use it in a session.

## How I want you to work
- Don't implement multiple features in one pass. Propose a plan first,
  wait for me to confirm, then implement ONE step at a time.
- After every change, tell me: (1) which file(s) you touched, (2) what
  changed, (3) why this was necessary.
- Prefer the smallest change that works over the "more correct" abstracted version.
- If there's a standard Android way vs. a shortcut, tell me both and which you're using.
- Ask before adding any third-party library. Default to plain Android SDK / Kotlin only.
- If unsure what I meant, ask — don't guess and implement.
- Commit to GitHub after every completed step.

## Environment (important)
- Windows machine, Claude Code runs in WSL Ubuntu.
- Project lives at: C:\Users\Kahra\Documents\Appmaker\todoapp
- Accessed from WSL at: /mnt/c/Users/Kahra/Documents/Appmaker/todoapp
- GitHub repo: https://github.com/theseltzer/todoapp
- Android Studio (Windows, NOT WSL) handles building and running on device.
- Do NOT run ./gradlew, adb, or emulator commands from WSL — just edit files.
- Language: Kotlin. UI: XML layouts (not Jetpack Compose yet).

## Build plan (steps)
- [x] Step 1 — Create project (Empty Views Activity, API 23, Kotlin DSL)
- [x] Step 2 — UI layout: EditText + Add button + RecyclerView in activity_main.xml
- [ ] Step 3 — List item layout: separate XML for each task row
- [ ] Step 4 — Adapter: bridge between task list data and the RecyclerView
- [ ] Step 5 — Wire up MainActivity: Add button adds tasks, delete removes them

## Current state
Step 2 complete. activity_main.xml has the input row and RecyclerView container.
No logic yet — MainActivity.kt is still the default template.

## Out of scope for now
- Data persistence (no database yet — tasks live in memory only)
- No cross-platform frameworks — native only
- No automated tests yet
- No Play Store publishing setup
