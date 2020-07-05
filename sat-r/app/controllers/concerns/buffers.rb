module Buffers extend ActiveSupport::Concern
  def initialize
    filename = File.join(Rails.root, "public", "uploads", "buffers.txt")
    fd = IO.sysopen(filename)
    @io = IO.new(fd)

    @buffer = @io.sysread(8)
    print @buffer
  end
end