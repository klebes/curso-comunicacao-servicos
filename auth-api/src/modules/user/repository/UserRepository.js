import User from "../model/User.js";

class UserRepository{
  async findById(id){
    try {
      return await User.findOne({where: {id}});
    } catch (err) {
      console.error("Erro no findbyID: ", err.message);
      throw err;
    }
  }

  async findByEmail(email) {
    try {
      return await User.findOne({where: { email } });
    } catch (err) {
      console.error("Erro no findByEmail: ", err.message);
      throw err;
    }
  }
}

export default new UserRepository();