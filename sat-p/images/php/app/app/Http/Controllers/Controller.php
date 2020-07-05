<?php

namespace App\Http\Controllers;
use App\Http\Concerns\Buffers;

use Laravel\Lumen\Routing\Controller as BaseController;

class Controller extends BaseController
{
    //
    public function index(){
        new Buffers();
        return 'Affirmative!';
    }
}
