class ApplicationController < ActionController::API
  after_action :cors_set_access_control_headers
  include Buffers
  def index
    initialize
    render plain: "Affirmative!"
  end

  private

  def cors_set_access_control_headers
    response.headers['Access-Control-Allow-Origin'] = 'http://localhost:9007'
    response.headers['Access-Control-Allow-Methods'] = 'POST, GET, PUT, PATCH, DELETE, OPTIONS'
    response.headers['Access-Control-Allow-Headers'] = 'Origin, Content-Type, Accept, Authorization, Token, Auth-Token, Email'
    response.headers['Access-Control-Max-Age'] = "1728000"
  end
end
