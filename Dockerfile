FROM python
WORKDIR /app
COPY . /app
RUN pip install -r requirements.txt
EXPOSE  3000
<<<<<<< HEAD
CMD ["python","main.py"]

=======
CMD ["python","main.py"]
>>>>>>> feature1
