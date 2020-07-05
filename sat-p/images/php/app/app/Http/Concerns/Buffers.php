<?php
namespace App\Http\Concerns;

use Log;

class Buffers {

    public function __construct(){
        $file = __DIR__.'/../../../public/uploads/buffer.txt';
        Log::info("File path::");
        Log::info($file);
        $fp = fopen($file, 'r');
        $buffer = stream_set_read_buffer($fp, 10);
    }
}
