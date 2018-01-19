const path               = require('path');
const CommonsChunkPlugin = require('webpack/lib/optimize/CommonsChunkPlugin');
const CopyWebpackPlugin  = require('copy-webpack-plugin');

const TARGET = process.env.npm_lifecycle_event;
const PATHS = {
    source: path.join(__dirname, 'app'),
    output: path.join(__dirname, '../../../target/classes/static')
};

module.exports = {
    entry: {
        'main'  : './app/main.ts'
    },
    output: {
        path    : PATHS.output,
        filename: 'bundle.js'
    },
    plugins: [
        new CopyWebpackPlugin([{from: './app/index.html', to: 'index.html'}])
    ],
    module: {
        loaders: [
            {test: /\.ts$/, loader: 'ts-loader'}
        ]
    },

    resolve: {
        extensions: ['.ts', '.js']
    },
    devServer: {
        contentBase: 'src',
        historyApiFallback: true
    },
    devtool: 'source-map'
};





