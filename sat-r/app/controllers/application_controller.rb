class ApplicationController < ActionController::API

    def index
        render plain: "Affirmative!"
    end
end
