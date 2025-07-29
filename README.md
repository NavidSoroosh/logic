# Modal Logic Model — Possible Worlds & Formula Evaluation

This project is a practical implementation of a simplified **possible-worlds model** for **modal logic**, using object-oriented design patterns in Java. It allows representing, interpreting, and evaluating **modal logic formulas** (e.g., epistemic or deontic logic) on a set of possible worlds connected via an accessibility relation.

---

## Objective

The goal is to:

1. Represent **modal formulas** using a composite object structure.
2. Build a **Kripke-like model** of possible worlds with accessibility relations.
3. Implement a **truth evaluation algorithm** to determine whether a formula is true in a given pointed model.
4. Extend the framework to support **epistemic** and **deontic** logics.

---

## Features

- Composite pattern for modal formulas:
  - **Unary operators**: `Box`, `Diamond`, `Neg`
  - **Binary operators**: `And`, `Or`, `Implies`, `Iff`
  - **Atoms**: propositional variables (`P`), `⊤` (top), and `⊥` (bottom)

- Model of possible worlds:
  - Class `Model` contains a set of `World`s
  - Accessibility relation: `HashMap<World, Set<World>>`
  - Each `World` contains the set of atomic propositions true in that world

- Truth evaluation:
  - Function to compute if a formula is satisfied in a given world of a given model

- Extendable:
  - Supports further work with **epistemic logic** (knowledge) and **deontic logic** (obligations)
