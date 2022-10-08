FROM node:13-alpine

# Install app dependencies
WORKDIR /app
COPY /app/package*.json /app/
RUN npm install

COPY /app/* /app/

CMD ["node", "/app/server.js"]

EXPOSE 3000