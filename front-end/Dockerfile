# FROM node:latest as build-step
# WORKDIR /app
# COPY package.json ./
# RUN npm install
# COPY . .
# RUN npm run buildProd

FROM openresty/openresty:latest
COPY nginx.conf /usr/local/openresty/nginx/conf
ADD /home/f4si13/Desktop/now 2/sams-dw/front-end/dist/front-end /usr/local/openresty/nginx/html/default/
EXPOSE 80
CMD /usr/local/openresty/nginx/sbin/nginx -p /home/f4si13/Desktop/now 2/sams-dw/front-end -c nginx.conf
