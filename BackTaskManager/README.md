#Android后台管理
##初衷
android后台时分随意，缺乏管教。各种应用进程随意开关，行为恶劣。
##设计
本App监听各种事件启动自身。
启动后获取当前任务列表。
监听后台新任务，如果该任务没有Activity实例则立刻kill。