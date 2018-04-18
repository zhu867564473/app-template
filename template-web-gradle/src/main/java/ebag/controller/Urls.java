package ebag.controller;

/**
 * 集中管理 URL.
 *
 * 其实此类名叫 Urls 不是很合适，基本都是 URI，但是对于大多数人来说 URL 更熟悉好记忆一些。
 * 还有少量变量不是 URI，例如 JSONP_CONTENT_TYPE，FORWARD 等，但不多，为了减少类，故就放在这里吧，约定好了就行。
 *
 * 变量名和 URI 规则:
 * 1. 页面 URI 的变量名以 PAGE_ 开头，此 URI 以 /page 开头，看到 URL 就知道是什么用途了
 * 2. 页面对应模版文件的变量名以 FILE_ 开头，表明这个 URI 是文件的路径，即模版的路径
 * 3. 普通 FORM 表单处理 URI 的变量名以 FORM_ 开头，此 URI 以 /form 开头
 * 4. 操作资源的 api 变量名以 API_ 开头，此 URI 以 /api 开头，使用 RESTful 风格
 */
public interface Urls {
    String JSONP_CONTENT_TYPE = "application/javascript;charset=UTF-8"; // JSONP 响应的 header

    // 通用
    String FORWARD    = "forward:";
    String REDIRECT   = "redirect:";
    String PAGE_404   = "/404";
    String FILE_ERROR = "error.html";

    // 案例展示
    String PAGE_DEMO_REST   = "/page/demo/rest";
    String FILE_DEMO_REST   = "demo/rest.html";
    String FORM_DEMO_UPLOAD = "/form/demo/upload";
    String API_DEMO_MYBATIS = "/api/demo/mybatis/{id}";

    // 登录注销
    String PAGE_LOGIN  = "/page/login";  // 登陆
    String PAGE_LOGOUT = "/page/logout"; // 注销
    String PAGE_DENY   = "/page/deny";   // 无权访问页面的 URL
    String FILE_LOGIN  = "login.html";   // 登陆页面
    String API_LOGIN_TOKENS = "/api/login/tokens"; // 登陆的 token

    // API 使用 RESTful 风格，变量名以 API_ 开头，URI 以 /api 开头, 资源都用复数形式便于统一管理 URL。
    // 下面以操作 subject, question 资源的 RESTful 风格的 URL 为例:
    // 列出 question 有 2 个相关的 URL，一是列出所有的 questions 用 API_QUESTIONS，
    // 另一个是列出主题下的所有 questions 用 API_QUESTIONS_IN_SUBJECT。
    String API_SUBJECTS        = "/api/subjects";
    String API_SUBJECTS_BY_ID  = "/api/subjects/{subjectId}";
    String API_QUESTIONS       = "/api/questions";
    String API_QUESTIONS_BY_ID = "/api/questions/{questionId}";
    String API_QUESTIONS_IN_SUBJECT = "/api/subjects/{subjectId}/questions";

    // 字典
    String FORM_DICTS_IMPORT = "/form/dicts/import"; // 导入字典
    String API_DICTS         = "/api/dicts";
    String API_DICT_TYPES    = "/api/dictTypes";

    // 地区
    String API_REGIONS = "/api/regions";

    // 学校
    String API_SCHOOLS_ID     = "/api/schoolId";
    String API_SCHOOLS        = "/api/schools";
    String API_SCHOOLS_BY_ID  = "/api/schools/{schoolId}";
    String API_SCHOOLS_ADMINS = "/api/schools/{schoolId}/admins"; // 学校管理员
}
