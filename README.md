# Unit Converter API

This project is a **Unit Converter API** built as part of the  
[roadmap.sh Unit Converter project](https://roadmap.sh/projects/unit-converter).

[roadmap.sh Solution Link](https://roadmap.sh/projects/unit-converter/solutions?u=657afb825145316d25021c0a).

The purpose of this project is **learning Spring Boot**, not building a production-grade application. The implementation intentionally prioritizes simplicity over flexibility.

## API Endpoint

The backend API runs on:
```http://localhost:8080```


This endpoint is **hardcoded in the frontend (`index.html`)**, where the JavaScript logic directly references the base URL inside a `<script>` block.

If you want to change the API endpoint, you **must update it manually in `index.html`**.  
There is **no dynamic configuration**, environment-based setup, or externalized configuration involved.

## Project Scope

- Built strictly for Spring Boot learning purposes
- Focuses on controllers and basic request handling
- No authentication, persistence, or validation layers
- Frontend and backend are loosely coupled with a hardcoded API URL
- Designed for local development only

## Important Notes

- This project is **not production-ready**
- Hardcoded values are intentional for learning simplicity
- Any improvements (configuration management, error handling, validation, REST best practices) are deliberately left out and should be added only after understanding the basics

If you are reviewing this project, judge it as a **learning exercise**, not a finished product.
