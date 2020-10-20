const express = require('express');
const app = express();
const morgan = require('morgan');



//settings
app.set('port', process.env.PORT || 3000);

//start server
app.listen(app.get('port'), () => {
    console.log('server on port 8080');
});


//middleware
app.use(morgan('dev'));
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

//routes
app.use('/api/forms', require('./routes/forms'));