<article class="markdown-body entry-content container-lg" itemprop="text">
    <h1>
        <a id="user-content-онлайн-проект-topjava" class="anchor" aria-hidden="true" href="#онлайн-проект-topjava">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Онлайн-проект <a href="https://github.com/JavaWebinar/topjava">Topjava</a>
    </h1>
    <ul>
        <li>Не стоит стремиться прочитать все ссылки урока, их можно использовать как справочник. Гораздо важнее пройти основной материал урока и сделать Домашнее Задание</li>
        <li>Обязательно посмотри <a href="https://github.com/JavaOPs/topjava/wiki/Git#Правила-работы-с-патчами-на-проекте">правила работы с патчами на проекте</a></li>
        <li>Делать Apply Patch лучше по одному, непосредственно перед видео на эту тему, а при просмотре видео сразу отслеживать все изменения кода проекта по изменению в патче (<code>Git-&gt; Local Changes-&gt; Ctrl+D</code>)</li>
        <li><strong>При первом Apply удобнее выбрать имя локального ченджлиста Name: Default</strong>. Далее все остальные патчи также будут в него попадать.</li>
        <li><strong>Код проекта обновляется и не всегда совпадает с видео (можно увидеть как развивался проект). Изменения в проекте указываю после соответствующего патча.</strong></li>
    </ul>
    <h2>
        <a id="user-content-материалы-занятия-скачать-все-патчи-можно-через-downloadскачать-папки-patch" class="anchor" aria-hidden="true" href="#материалы-занятия-скачать-все-патчи-можно-через-downloadскачать-папки-patch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a href="https://drive.google.com/drive/u/0/folders/0B9Ye2auQ_NsFfm5hSHEtbmxmN2kxb0NocVRwWl9KanowWXVCVXRZTlhaM09wQUswZkRidTA" rel="nofollow">Материалы занятия</a> (скачать все патчи можно через <code>Download/Скачать</code> папки patch)
    </h2>
    <p><a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/18330295/5f2ca214-7560-11e6-8e1e-c0494f798c37.png"><img src="https://cloud.githubusercontent.com/assets/13649199/18330295/5f2ca214-7560-11e6-8e1e-c0494f798c37.png" alt="image" style="max-width:100%;"></a></p>
    <h3>
        <a id="user-content--рефакторинг-проекта" class="anchor" aria-hidden="true" href="#-рефакторинг-проекта">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png" alt="correction" style="max-width:100%;"></a> Рефакторинг проекта
    </h3>
    <h4>
        <a id="user-content-apply-1_0_renamepatch" class="anchor" aria-hidden="true" href="#apply-1_0_renamepatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_0_rename.patch
    </h4>
    <ul>
        <li>переименовал классы <code>UserMeal*</code> в более красивые <code>Meal*</code></li>
        <li>преименовал <code>MealWithExceed</code> transfer object класс (что это такое пройдем позже)  в <code>MealTo</code> (<a href="https://stackoverflow.com/questions/1724774/java-data-transfer-object-naming-convention" rel="nofollow">data transfer object naming convention</a>)</li>
    </ul>
    <h2>
        <a id="user-content--разбор-домашнего-задания-hw0" class="anchor" aria-hidden="true" href="#-разбор-домашнего-задания-hw0">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png" alt="hw" style="max-width:100%;"></a> Разбор домашнего задания HW0:
    </h2>
    <h3>
        <a id="user-content--1-optional-реализация-getfilteredmealswithexcess-через-stream-api" class="anchor" aria-hidden="true" href="#-1-optional-реализация-getfilteredmealswithexcess-через-stream-api">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 1. <a href="https://drive.google.com/file/d/1hXU8VUKVxrayyQ6Xu7f3OGZWCSdK9Pyi" rel="nofollow">Optional: реализация getFilteredMealsWithExcess через Stream API</a>
    </h3>
    <ul>
        <li>В патче <code>prepare_to_HW0.patch</code> вступительного задания метод фильтрации в <code>TimeUtil</code> переименовали в <code>isBetweenHalfOpen</code> (также изменилась логика сравнения - <code>startTime</code> включается в интервал)</li>
    </ul>
    <h4>
        <a id="user-content-apply-1_1_hw0_streamspatch" class="anchor" aria-hidden="true" href="#apply-1_1_hw0_streamspatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_1_HW0_streams.patch
    </h4>
    <ul>
        <li><a href="https://docs.google.com/presentation/d/1oltLkHK60FqIdsXjUdm4pPLSeC6KpNYjDsM0ips-qBw" rel="nofollow">Презентация Java 8</a></li>
    </ul>
    <h3>
        <a id="user-content--2-работа-с-git-в-idea-реализация-через-цикл" class="anchor" aria-hidden="true" href="#-2-работа-с-git-в-idea-реализация-через-цикл">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 2. <a href="https://drive.google.com/open?id=1K0kan7TEUeOAe_qcdCtRF9rsqD-NwFZ7" rel="nofollow">Работа с git в IDEA. Реализация через цикл.</a>
    </h3>
    <h3>
        <a id="user-content-внимание-патчей-1_opt_2_cycles_hw0-и-1_opt_3_opt2_hw0-не-будет-в-проекте-делаем-в-отдельной-ветке-у-меня-mealsutil_opt-это-варианты-решений-которые-не-идут-в-master" class="anchor" aria-hidden="true" href="#внимание-патчей-1_opt_2_cycles_hw0-и-1_opt_3_opt2_hw0-не-будет-в-проекте-делаем-в-отдельной-ветке-у-меня-mealsutil_opt-это-варианты-решений-которые-не-идут-в-master">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        ВНИМАНИЕ! Патчей <code>1_opt_2_cycles_HW0</code> и <code>1_opt_3_opt2_HW0</code> не будет в проекте! Делаем в отдельной ветке (у меня <code>MealsUtil_opt</code>). Это варианты решений, которые не идут в <code>master</code>
    </h3>
    <p><a target="_blank" rel="noopener noreferrer" href="https://user-images.githubusercontent.com/13649199/83656711-8b758b00-a5c8-11ea-9de4-c2ade77d4598.png"><img src="https://user-images.githubusercontent.com/13649199/83656711-8b758b00-a5c8-11ea-9de4-c2ade77d4598.png" alt="image" style="max-width:100%;"></a></p>
    <h4>
        <a id="user-content-apply-1_opt_2_cycles_hw0patch" class="anchor" aria-hidden="true" href="#apply-1_opt_2_cycles_hw0patch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_opt_2_cycles_HW0.patch
    </h4>
    <h3>
        <a id="user-content--вопросы-по-hw0" class="anchor" aria-hidden="true" href="#-вопросы-по-hw0">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png" alt="question" style="max-width:100%;"></a> Вопросы по HW0
    </h3>
    <blockquote>
        <p>почему не использовать в <code>TimeUtil</code> методы <code>isBefore/isAfter</code> ?</p>
    </blockquote>
    <p>это строгие (excluded) сравнения, а нам также нужно краевые значения</p>
    <blockquote>
        <p>В <code>MealsUtil</code> у нас где-то есть ключевое слово <code>final</code>, где-то нет. В чем разница?</p>
    </blockquote>
    <p>Я участвовал в одном  проекте, где <code>final</code> был обязательным (в сеттингах IDEA галочка стояла). Но это скорее исключение, чем правило в проектах java (в Java 8 вообще ввели эффективный final, те по факту). Во всех новомодных языках переменные final по умолчанию, а в java нужно помнить и везде добавлять, утомительно. Но если приучитесь - хуже не будет. Я обычно ставлю там, где важно по смыслу (если не забываю).</p>
    <h3>
        <a id="user-content--3-hw0-optional-2-реализация-в-один-проход-циклами-и-stream-api" class="anchor" aria-hidden="true" href="#-3-hw0-optional-2-реализация-в-один-проход-циклами-и-stream-api">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 3. <a href="https://drive.google.com/file/d/1GaYaQvv2h9r_PnjikdkNmiHYW0zEzURW" rel="nofollow">HW0 Optional 2: реализация в один проход циклами и Stream API</a>
    </h3>
    <h4>
        <a id="user-content-apply-1_opt_3_hw0_opt2patch" class="anchor" aria-hidden="true" href="#apply-1_opt_3_hw0_opt2patch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_opt_3_HW0_opt2.patch
    </h4>
    <ul>
        <li><a href="https://www.jetbrains.com/lp/devecosystem-2020/java/" rel="nofollow">DevEcosystem from JetBrains</a></li>
        <li>
            Дополнительно:
            <ul>
                <li><a href="https://github.com/JavaOPs/masterjava">Первое занятие MasterJava: многопоточность</a></li>
                <li><a href="https://habr.com/ru/company/luxoft/blog/157273/" rel="nofollow">Обзор java.util.concurrent.*</a></li>
            </ul>
        </li>
    </ul>
    <h2>
        <a id="user-content-занятие-1" class="anchor" aria-hidden="true" href="#занятие-1">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Занятие 1:
    </h2>
    <h3>
        <a id="user-content--4-обзор-используемых-в-проекте-технологий-интеграция-по" class="anchor" aria-hidden="true" href="#-4-обзор-используемых-в-проекте-технологий-интеграция-по">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFRmo0YkVVaDJPTVE" rel="nofollow">Обзор используемых в проекте технологий. Интеграция ПО.</a>
    </h3>
    <ul>
        <li><a href="https://www.jrebel.com/blog/2020-java-technology-report" rel="nofollow">2020 Java Technology Report</a></li>
        <li><a href="http://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-2016/" rel="nofollow">Обзор популярности инструментов и технологий Java за 2016 г.</a></li>
        <li><a href="http://zeroturnaround.com/rebellabs/java-tools-and-technologies-landscape-for-2014/" rel="nofollow">Обзор популярности инструментов и технологий Java за 2014 г.</a></li>
        <li><a href="http://www.youtube.com/watch?v=rJZHerwi8R0" rel="nofollow">Видео "Приложение Spring Pet Clinic"</a></li>
        <li>Приложение <a href="https://github.com/spring-projects/spring-petclinic">Spring Pet Clinic</a>.</li>
    </ul>
    <h3>
        <a id="user-content--5-обзор-языка-java-и-его-инфраструктуры" class="anchor" aria-hidden="true" href="#-5-обзор-языка-java-и-его-инфраструктуры">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 5. <a href="https://www.youtube.com/watch?v=jWfqopZwcNs" rel="nofollow">Обзор языка Java и его инфраструктуры</a>
    </h3>
    <ul>
        <li><a href="https://www.tiobe.com/tiobe-index/" rel="nofollow">Tiobe index</a></li>
        <li><a href="https://zeroturnaround.com/rebellabs/developer-productivity-report-2017-why-do-you-use-java-tools-you-use/" rel="nofollow">RebelLabs Developer Productivity Report 2017: Why do you use the Java tools you use</a></li>
        <li><a href="https://www.baeldung.com/java-in-2018" rel="nofollow">The State of Java in 2018</a></li>
        <li><a href="https://snyk.io/blog/jvm-ecosystem-report-2018/" rel="nofollow">2018 JDK, Tools, Platform and Application, processes and you reports</a></li>
    </ul>
    <h3>
        <a id="user-content--6-maven" class="anchor" aria-hidden="true" href="#-6-maven">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 6. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFSlZMTXBJRXJpakU" rel="nofollow">Maven.</a>
    </h3>
    <ul>
        <li>Среда сборки проектов <a href="https://www.examclouds.com/ru/java/java-core-russian/lesson20" rel="nofollow">Maven</a>.</li>
        <li><a href="http://search.maven.org/#browse" rel="nofollow">The Central Repository</a></li>
        <li><a href="http://maven.apache.org/guides/mini/guide-multiple-modules.html" rel="nofollow">The Reactor</a>. Snapshots</li>
        <li><a href="http://habrahabr.ru/blogs/java/106717/" rel="nofollow">Недостатки Maven</a>. Другие инструменты сборки.</li>
        <li>
            Справочник:
            <ul>
                <li><a href="https://www.youtube.com/watch?v=21qdRgFsTy0" rel="nofollow">Видео: Maven vs Gradle vs SBT (Архипов, Борисов, Садогурский)</a></li>
                <li><a href="http://habrahabr.ru/post/77333/" rel="nofollow">Автоматизация сборки проекта</a></li>
                <li><a href="http://maven.apache.org/" rel="nofollow">Home Page</a></li>
                <li><a href="http://books.sonatype.com/mvnref-book/reference/index.html" rel="nofollow">Maven: The Complete Reference</a></li>
                <li><a href="http://study-and-dev.com/blog/build_management_maven_1/" rel="nofollow">Разработка ПО вместе с maven</a></li>
                <li><a href="http://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html" rel="nofollow">Build Lifecycle</a></li>
                <li><a href="http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html" rel="nofollow">Dependency Mechanism</a></li>
                <li><a href="http://habrahabr.ru/post/111408/" rel="nofollow">Создание своих архетипов и каталогов в Maven</a></li>
                <li><a href="http://www.ibm.com/developerworks/ru/library/j-5things13/" rel="nofollow">Зависимости, профили</a></li>
                <li><a href="http://blog.bintray.com/2014/02/11/bintray-as-pain-free-gateway-to-maven-central/" rel="nofollow">Bintray: gateway to Maven Central</a></li>
            </ul>
        </li>
    </ul>
    <h3>
        <a id="user-content--7-war-веб-контейнер-tomcat-сервлеты" class="anchor" aria-hidden="true" href="#-7-war-веб-контейнер-tomcat-сервлеты">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 7. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFT3pWNkMzWVVybnc" rel="nofollow">WAR. Веб-контейнер Tomcat. Сервлеты.</a>
    </h3>
    <blockquote>
        <ul>
            <li>Обновил зависимость до Servlet 4.0. Установите себе <a href="https://tomcat.apache.org/download-90.cgi" rel="nofollow">Tomcat 9.x</a></li>
            <li>Устанавливать Tomcat лучше простым скачиванием архива <code>xxx.zip</code> (например для Windows <code>apache-tomcat-9.0.35-windows-x64.zip</code>) и копированием из него в <strong>каталог без пробелов и русских букв</strong> (пример <code>С:\java\apache-tomcat-9.0.35</code>)</li>
        </ul>
    </blockquote>
    <h3>
        <a id="user-content-внимание-далее-патчи-идут-в-ветку-master-после-1_1_hw0_streams" class="anchor" aria-hidden="true" href="#внимание-далее-патчи-идут-в-ветку-master-после-1_1_hw0_streams">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        ВНИМАНИЕ! далее патчи идут в ветку <code>master</code> после <code>1_1_HW0_streams</code>
    </h3>
    <h4>
        <a id="user-content-apply-1_2_switch_to_warpatch" class="anchor" aria-hidden="true" href="#apply-1_2_switch_to_warpatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_2_switch_to_war.patch
    </h4>
    <blockquote>
        <ul>
            <li>Обновил сервлеты до версии 4.0 (Tomcat 9 использует это API, хотя для нас не принципиально, т.к. мы никакие <a href="https://ru.wikipedia.org/wiki/Сервлет_(Java)" rel="nofollow">фичи 3.x и 4.x Servlet API</a> не используем)</li>
            <li>Переименовал <code>userList.jsp</code> в <code>users.jsp</code></li>
        </ul>
    </blockquote>
    <h3>
        <a id="user-content-сервлет-добавляется-в-следующем-патче-те-в-webxml-он-будет-подчеркиваться-красным" class="anchor" aria-hidden="true" href="#сервлет-добавляется-в-следующем-патче-те-в-webxml-он-будет-подчеркиваться-красным">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Сервлет добавляется в следующем патче, те в <code>web.xml</code> он будет подчеркиваться красным.
    </h3>
    <h4>
        <a id="user-content-apply-1_3_add_servlet_apipatch" class="anchor" aria-hidden="true" href="#apply-1_3_add_servlet_apipatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_3_add_servlet_api.patch
    </h4>
    <blockquote>
        <ul>
            <li>Если зависимость <code>servlet-api</code> не подтянулась, сделай <code>Reimport All Maven Projects</code> (см. <a href="https://github.com/JavaOPs/topjava/wiki/IDEA#maven_update">Обновить зависимости в maven проекте</a>).
                <strong>Все зависимости в Maven прект подтягиваются ТОЛЬКО через Maven</strong>.
            </li>
            <li><a href="https://stackoverflow.com/a/38953356/548473" rel="nofollow">Проверка, кто занял порт</a> (в случае проблем с запуском и дебагом на портах 8080, 8000)</li>
            <li><a href="https://github.com/JavaOPs/topjava/wiki/IDEA#%D0%94%D0%B5%D0%BF%D0%BB%D0%BE%D0%B9-war-%D0%B2-tomcat-application-context-%D0%B4%D0%BE%D0%BB%D0%B6%D0%B5%D0%BD-%D0%B1%D1%8B%D1%82%D1%8C-%D1%82%D0%BE%D1%82-%D0%B6%D0%B5-%D1%87%D1%82%D0%BE-%D0%B8-url-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B4%D0%B5%D0%BF%D0%BB%D0%BE%D0%B8%D1%82%D1%8C-%D0%BD%D0%B0%D0%B4%D0%BE-war-exploded"><strong>Деплой war в Tomcat с Application context</strong></a></li>
            <li><a href="https://github.com/JavaOPs/topjava/wiki/IDEA#%D0%94%D0%BB%D1%8F-%D0%B4%D0%B8%D0%BD%D0%B0%D0%BC%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9-%D0%BF%D0%B5%D1%80%D0%B5%D0%B3%D1%80%D1%83%D0%B7%D0%BA%D0%B8-%D1%80%D0%B5%D1%81%D1%83%D1%80%D1%81%D0%BE%D0%B2-%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0-%D0%BD%D0%B0%D0%B6%D0%BC%D0%B8%D1%82%D0%B5-%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D1%83-update-resource-on-frame-deactivation"><strong>Динамическое обновление без передеплоя</strong></a></li>
        </ul>
    </blockquote>
    <h4>
        <a id="user-content-apply-1_4_forward_to_redirectpatch" class="anchor" aria-hidden="true" href="#apply-1_4_forward_to_redirectpatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_4_forward_to_redirect.patch
    </h4>
    <ul>
        <li><a href="http://tomcat.apache.org/" rel="nofollow">Tomcat Home Page</a></li>
        <li><a href="https://metanit.com/java/javaee/4.8.php" rel="nofollow">Жизненный цикл сервлета. Для каждого сервлета создается только одна копия</a></li>
        <li><a href="http://java-course.ru/student/book1/servlet/" rel="nofollow">Сервлеты</a></li>
        <li><a href="https://devcolibri.com/как-создать-servlet-полное-руководство/" rel="nofollow">Руководство: как создать servlet</a></li>
        <li>
            Томкат менеджер: <a href="http://localhost:8080/manager" rel="nofollow">http://localhost:8080/manager</a>
            <ul>
                <li>в <code>TOMCAT_HOME\conf\tomcat-users.xml</code> нужно добавить</li>
            </ul>
        </li>
    </ul>
    <pre><code>&lt;user username="tomcat" password="tomcat" roles="tomcat,manager-gui,admin-gui"/&gt;
</code></pre>
    <ul>
        <li>
            <p>Если проблема с Tomcat debug и работает Dr.Web- нужно его отключить, либо добавить в исключения путь к  <code>.IntelliJIdeaXXX/</code></p>
        </li>
        <li>
            <p>Наше приложение: <a href="http://localhost:8080/topjava" rel="nofollow">http://localhost:8080/topjava</a></p>
        </li>
        <li>
            <p>Наш сервлет:     <a href="http://localhost:8080/topjava/users" rel="nofollow">http://localhost:8080/topjava/users</a></p>
        </li>
        <li>
            <p>Дополнительно:</p>
            <ul>
                <li>
                    Remote debug встречается много реже - приконнекчивание к уже запущенной JVM, которую, например, нельзя запустить из IDEA. Можно попробовать запустить catalina через <code>jpda start</code>, задеплоить туда war и уже после этого после приконнектиться через запуск <code>Tomcat Server -&gt; Remote</code>
                    <ul>
                        <li><a href="https://github.com/JavaOPs/topjava/wiki/IDEA#remote-debug-%D0%B2-%D0%BD%D0%BE%D0%B2%D0%BE%D0%B9-idea">Настройки Remote Debug в новой IDEA</a></li>
                        <li><a href="http://blog.trifork.com/2014/07/14/how-to-remotely-debug-application-running-on-tomcat-from-within-intellij-idea" rel="nofollow">Remotely debug on tomcat from IDEA</a></li>
                    </ul>
                </li>
                <li><a href="https://developer.mozilla.org/ru/docs/Web/HTTP" rel="nofollow">HTTP</a></li>
                <li><a href="http://info.javarush.ru/idea_help/2014/01/22/Руководство-пользователя-IntelliJ-IDEA-Отладчик-.html" rel="nofollow">Отладчик IntelliJ IDEA</a></li>
                <li><a href="https://www.youtube.com/watch?v=tN8K1y-HSws&amp;list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&amp;index=14" rel="nofollow">Yakov Fain: Intro to Java EE. Glassfish. Servlets (по-русски)</a></li>
                <li><a href="https://www.youtube.com/watch?v=Vumy_fbo-Qs&amp;list=PLkKunJj_bZefB1_hhS68092rbF4HFtKjW&amp;index=15" rel="nofollow">Yakov Fain: HTTP Sessions, Cookies, WAR deployments, JSP (по-русски)</a></li>
                <li><a href="https://www.youtube.com/playlist?list=PLoij6udfBncjHaO5s7Ln4w4BLj5FVc49P" rel="nofollow">Golovach Courses: Junior.February2014.Servlets</a></li>
                <li><a href="http://java-online.ru/jsp.xhtml" rel="nofollow">Java Server Page</a></li>
                <li><a href="http://stackoverflow.com/questions/1890438/how-to-get-parameters-from-the-url-with-jsp#1890462" rel="nofollow">Java объекты, доступные в JSP</a></li>
            </ul>
        </li>
    </ul>
    <h3>
        <a id="user-content--8-логирование" class="anchor" aria-hidden="true" href="#-8-логирование">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png" alt="video" style="max-width:100%;"></a> 8. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaTdYUnpLNFFUeXM" rel="nofollow">Логирование.</a>
    </h3>
    <h4>
        <a id="user-content-apply-1_5_loggingpatch" class="anchor" aria-hidden="true" href="#apply-1_5_loggingpatch">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Apply 1_5_logging.patch
    </h4>
    <p><strong>Установите переменную окружения на TOPJAVA_ROOT на корень проекта и перезапустите IDEA. Слеши в пути должны быть в стиле unix (/)</strong></p>
    <ul>
        <li><a href="https://www.xenovation.com/blog/development/java/how-to-set-java-home" rel="nofollow">Set environment for Win/Mac/Unix</a></li>
        <li><a href="https://askubuntu.com/a/849954" rel="nofollow">Set environment for UNIX</a></li>
        <li>Или простой вариант (не забудте добавить и в Run, и в Debug)</li>
    </ul>
    <p><a target="_blank" rel="noopener noreferrer" href="https://user-images.githubusercontent.com/13649199/76862707-8af21180-686f-11ea-9f8c-2bb30ef4c3b2.png"><img src="https://user-images.githubusercontent.com/13649199/76862707-8af21180-686f-11ea-9f8c-2bb30ef4c3b2.png" alt="image" style="max-width:100%;"></a></p>
    <p><strong>Иногда антивирусы блокируют логирование (например Comodo). Если не работает и стоит антивирус- добавьте исключение.</strong></p>
    <blockquote>
        <ul>
            <li>изменения в проекте: убрал <code>LoggerWrapper</code> и логирую напрямую в логгер SLF4J. При логгировании через вспомогательный класс, в логе теряется имя исходного класса.</li>
            <li>удалил зависимость <code>jul-to-slf4j</code>. Она нам не нужна и, согласно <a href="https://www.youtube.com/watch?v=qzqAUUgB3v8" rel="nofollow">видео Владимира Красильщика про логирование</a>, она замедляет работу</li>
            <li>удалил зависимость <code>jcl-over-slf4j</code>. Используем Spring 5, который напрямую использует <code>slf4j</code> без <code>common-logging</code>. Про миграцию на Spring 5 будет видео в следующих занятиях.</li>
            <li>
                Не делать конкатенацию строк при логгировании сообщений, если уровень логирования в конфигурации выставлен выше уровня логирования в коде
                <ul>
                    <li><a href="http://stackoverflow.com/a/10596390/548473" rel="nofollow">slf4j formatting with {}</a></li>
                    <li><a href="https://www.slf4j.org/faq.html#logging_performance" rel="nofollow">What is the fastest way of (not) logging</a></li>
                </ul>
            </li>
        </ul>
    </blockquote>
    <ul>
        <li><a href="http://habrahabr.ru/post/113145/" rel="nofollow">Java Logging: история кошмара</a></li>
        <li><a href="https://javarush.ru/quests/lectures/questcollections.level04.lecture09" rel="nofollow">JavaRush: Logger</a></li>
        <li><a href="http://web.archive.org/web/20201127002158/http://skipy.ru/useful/logging.html" rel="nofollow">Ведение лога приложения</a></li>
        <li><a href="http://logging.apache.org/log4j/2.x/index.html" rel="nofollow">Log4j</a>, <a href="http://logback.qos.ch/" rel="nofollow">Logback</a></li>
        <li><a href="http://www.slf4j.org/legacy.html" rel="nofollow">Добавление зависимостей логирования</a> в проект.</li>
        <li><a href="http://logback.qos.ch/manual/configuration.html#variableSubstitution" rel="nofollow">Logback variable substitution</a></li>
    </ul>
    <h4>
        <a id="user-content-проверочные-вопросы" class="anchor" aria-hidden="true" href="#проверочные-вопросы">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Проверочные вопросы:
    </h4>
    <ul>
        <li>Что нужно изменить в <code>pom.xml</code>, чтобы перейти с logback на log4j ?</li>
    </ul>
    <h3>
        <a id="user-content--ваши-вопросы" class="anchor" aria-hidden="true" href="#-ваши-вопросы">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png" alt="question" style="max-width:100%;"></a> Ваши вопросы
    </h3>
    <blockquote>
        <p>Почему <code>private static final Logger log</code> а не <code>LOG</code> ?</p>
    </blockquote>
    <p>Это <a href="https://google.github.io/styleguide/javaguide.html#s5.2.4-constant-names" rel="nofollow">правило именования констант, которые не "deeply immutable"</a>, те если их содержимое можно изменить.</p>
    <blockquote>
        <p>Используются ли еще где-то в реальной разработке JSP, или это уже устаревшая технология? Заменит ли ее JSF (<a href="https://javatalks.ru/topics/38037" rel="nofollow">https://javatalks.ru/topics/38037</a>)?</p>
    </blockquote>
    <p>JSF и JSP- разные ниши и задачи.
        JSP- шаблонизатор, JSF - МVС фреймворк. Из моего опыта- с JSP сталкивался в 60% проектов. Его прямая замена: <a href="http://www.thymeleaf.org" rel="nofollow">http://www.thymeleaf.org</a> (в Spring-Boot по умолчанию), но в уже запущенных проектах встречается достаточно редко. JSP не умирает, потому что просто и дешево. Кроме того включается в большинство веб-контейнеров (в Tomcat его реализация Jasper)
    </p>
    <p>JSF- sun-овский еще фреймворк, с которым я ни разу не сталкивался и особого желания нет. Вот он как раз, по моему мнению, активно замещается хотя бы javascript фреймворками (angular, react, vue.js).</p>
    <blockquote>
        <p>А зачем мы использовали logback? Почему SLF4J нас не устроило? Почему реализация логирования не log4j?</p>
    </blockquote>
    <p><code>SLF4J-API</code> это API. Там есть только пустая реализация <code>org.slf4j.helpers.NOPLogger</code> (можно посмотреть в исходниках). Logback для новых проектов стал стандарт. <em>spring-petclinic</em> и <em>spring-boot</em> используют его по умолчанию.</p>
    <ul>
        <li><a href="http://logback.qos.ch/reasonsToSwitch.html" rel="nofollow">http://logback.qos.ch/reasonsToSwitch.html</a></li>
    </ul>
    <blockquote>
        <p>Откуда на maven диаграмме зависимостей появляется <code>slf4j-api</code> 1.7.25?</p>
    </blockquote>
    <p>Это транзитивная зависимость <code>logback-classic</code> (те подтягивается вместе с ним). Ме ее явно перекрыли новой версией <code>slf4j-api</code> 1.7.30, которая совместима с <code>logback-classic</code> 1.2.3. Можно было бы оставить как есть, но когда мы добавим в проект бриджи, они будут у нас более новые (также с версией 1.7.30).</p>
    <hr>
    <h2>
        <a id="user-content--домашнее-задание-hw01-делаем-ветку-hw01-от-последнего-патча-в-master" class="anchor" aria-hidden="true" href="#-домашнее-задание-hw01-делаем-ветку-hw01-от-последнего-патча-в-master">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png" alt="hw" style="max-width:100%;"></a> Домашнее задание HW01 (делаем ветку HW01 от последнего патча в master)
    </h2>
    <h4>
        <a id="user-content-основное-чему-мы-учимся-на-проекте-мыслить-и-работать-как-java-разработчики-уже-сейчас-потом-это-будет-гораздо-сложнее-и-стоить-дороже" class="anchor" aria-hidden="true" href="#основное-чему-мы-учимся-на-проекте-мыслить-и-работать-как-java-разработчики-уже-сейчас-потом-это-будет-гораздо-сложнее-и-стоить-дороже">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <strong>ОСНОВНОЕ, чему мы учимся на проекте: мыслить и работать как Java разработчики уже сейчас</strong>, потом это будет гораздо сложнее и стоить дороже.
    </h4>
    <p>Вот на мой взгляд <a href="http://blog.csssr.ru/2016/09/19/how-to-be-a-beginner-developer" rel="nofollow">хорошие советы новичкам</a>. От себя я добавлю:</p>
    <blockquote>
        <ul>
            <li>
                Учись грамотно формулировать проблему. Проблема "у меня не работает" может иметь тысячи причин. В процессе формулирования очень часто приходит ее решение.
                <ul>
                    <li>что я делаю (подробно, чтобы понял человек, который не копался в этом совсем)</li>
                    <li>что получаю (обычно верх самого последнего эксепшена)</li>
                    <li>мои попытки решения проблемы</li>
                </ul>
            </li>
        </ul>
    </blockquote>
    <blockquote>
        <ul>
            <li>Учись исследовать проблему. Внимательное чтение логов и <a href="http://info.javarush.ru/idea_help/2014/01/22/%D0%A0%D1%83%D0%BA%D0%BE%D0%B2%D0%BE%D0%B4%D1%81%D1%82%D0%B2%D0%BE-%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D1%8F-IntelliJ-IDEA-%D0%9E%D1%82%D0%BB%D0%B0%D0%B4%D1%87%D0%B8%D0%BA-.html" rel="nofollow">умение дебажить</a> - основные навыки разработчика. Обычно самый верх самого нижнего эксепшена- причина ошибки, туда нужно ставить брекпойнт.</li>
            <li>Грамотно уделяй время каждой проблеме. Две крайности - сразу бросаться за помощью и биться над ней часами. Пробуй решить ее сам и в зависимости от проблемы выделяй на это разумное время.</li>
        </ul>
    </blockquote>
    <hr>
    <ul>
        <li><strong>Обязательно и как можно чаще пользуйтесь <code>Ctrl+Alt+L</code> - отформатировать код класса</strong></li>
        <li><strong>При изменениях на UI не забываетй сбрасывать кэш браузера - <code>Ctrl+F5</code></strong></li>
        <li><strong>При удалении классов не забывате чистить target - в окошке Maven или <code>mvn clean</code></strong></li>
        <li><strong>При проблемах с IDEA пользуйтесь <code>Refresh</code> в окошке Maven</strong></li>
        <li><strong>При проблемах с выполнением проверьте (и удалите) лишние java процессы (например в Task Manager)</strong></li>
    </ul>
    <hr>
    <h4>
        <a id="user-content-1-реализовать-сервлет-с-отображением-в-таблице-списка-еды-в-памяти-и-без-учета-пользователя" class="anchor" aria-hidden="true" href="#1-реализовать-сервлет-с-отображением-в-таблице-списка-еды-в-памяти-и-без-учета-пользователя">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        1. Реализовать сервлет с отображением в таблице списка еды (в памяти и БЕЗ учета пользователя)
    </h4>
    <blockquote>
        <p>Деплоиться в Tomcat лучше как <code>war exploded</code>: нет упаковки в war и при нажатой кнопке <code>Update Resources on Frame Deactivation</code> можно обновляться css, html, jsp без передеплоя. При изменении <code>web.xml</code>, добавлении методов, классов необходим redeploy.</p>
    </blockquote>
    <ul>
        <li>
            1.1 По аналогии с <code>UserServlet</code> добавить <code>MealServlet</code> и <code>meals.jsp</code>
            <ul>
                <li>Задеплоить приложение (war) в Tomcat c <code>applicationContext=topjava</code> (приложение должно быть доступно по <a href="http://localhost:8080/topjava" rel="nofollow"></a><a href="http://localhost:8080/topjava" rel="nofollow">http://localhost:8080/topjava</a>)</li>
                <li>Попробовать разные деплои в Tomcat, remote и local debug</li>
            </ul>
        </li>
        <li>
            1.2 Сделать отображения списка еды в JSP, цвет записи в таблице зависит от параметра <code>excess</code> (красный/зеленый).
            <ul>
                <li>1.2.1 Список еды захардкодить (те проинициализировать в коде, желательно чтобы в проекте инициализация была только в одном месте). Норму калорий (caloriesPerDay) сделать в коде константой</li>
                <li>1.2.2 Время выводить без 'T'</li>
                <li>1.2.3 Список выводим БЕЗ фильтрации по <code>startTime/endTime</code></li>
                <li>1.2.4 С обработкой исключений пока можно не заморачиваться, мы будем красиво обрабатывать в конце стажировки</li>
                <li>
                    1.2.5 Вариант реализации:
                    <ul>
                        <li>из сервлета преобразуете еду в <code>List&lt;MealTo&gt;</code>;</li>
                        <li>кладете список в запрос (<code>request.setAttribute</code>);</li>
                        <li>делаете <code>forward</code> на jsp для отрисовки таблицы (при <code>redirect</code> атрибуты теряются).</li>
                        <li><strong>JSP работает через геттеры: <code>meal.dateTime</code> в JSP вызывает <code>meal.getDateTime()</code></strong></li>
                        <li>в <code>JSP</code> для цикла можно использовать <code>JSTL tag forEach</code>. Для подключения <code>JSTL</code> в <code>pom.xml</code> и шапку JSP нужно добавить:</li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
    <pre><code>
        &lt;dependency&gt;
        &lt;groupId&gt;javax.servlet&lt;/groupId&gt;
        &lt;artifactId&gt;jstl&lt;/artifactId&gt;
        &lt;version&gt;1.2&lt;/version&gt;
        &lt;/dependency&gt;
        &lt;%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %&gt;
        ...
    </code></pre>
    <ul>
        <li><a href="http://java-course.ru/student/book1/servlet/" rel="nofollow">Интернет-приложения на JAVA</a></li>
        <li><a href="http://java-course.ru/student/book1/jsp/" rel="nofollow">JSP</a></li>
        <li><a href="https://devcolibri.com/%D0%BA%D0%B0%D0%BA-%D1%81%D0%BE%D0%B7%D0%B4%D0%B0%D1%82%D1%8C-servlet-%D0%BF%D0%BE%D0%BB%D0%BD%D0%BE%D0%B5-%D1%80%D1%83%D0%BA%D0%BE%D0%B2%D0%BE%D0%B4%D1%81%D1%82%D0%B2%D0%BE" rel="nofollow">
            Как создать Servlet? Полное руководство</a></li>
        <li><a href="https://devcolibri.com/jstl-%D0%B4%D0%BB%D1%8F-%D0%BD%D0%B0%D0%BF%D0%B8%D1%81%D0%B0%D0%BD%D0%B8%D1%8F-jsp-%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86/" rel="nofollow">
            JSTL для написания JSP страниц</a></li>
        <li><a href="http://javatutor.net/articles/jstl-patterns-for-developing-web-application-1" rel="nofollow">JSTL: Шаблоны
            для разработки веб-приложений в java</a></li>
        <li><a href="http://stackoverflow.com/questions/35606551/jstl-localdatetime-format" rel="nofollow">JSTL LocalDateTime
            format</a></li>
    </ul>
    <h3>
        <a id="user-content-optional" class="anchor" aria-hidden="true" href="#optional">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Optional
    </h3>
    <h4>
        <a id="user-content-2-реализуем-в-памяти-crud-createreadupdatedelete-для-еды" class="anchor" aria-hidden="true" href="#2-реализуем-в-памяти-crud-createreadupdatedelete-для-еды">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
    2. Реализуем в ПАМЯТИ CRUD (create/read/update/delete) для еды
    </h4>
    <p><strong>
        Пример: <a href="https://danielniko.wordpress.com/2012/04/17/simple-crud-using-jsp-servlet-and-mysql" rel="nofollow">
        Simple CRUD using Servlet/JSP</a>
    </strong></p>
    <blockquote>
        <ul>
            <li>Пример нужно САМОСТОЯТЕЛЬНО переделать: вместо хранения в MySql нужно хранить в ПАМЯТИ (задание упрощается).</li>
            <li>Классы: сервлет, инрерфейс хранения, его реализация для хранения в памяти</li>
        </ul>
    </blockquote>
    <ul>
        <li>2.1 Хранение в памяти будет одна из наших CRUD реализаций (позже будет JDBC, JPA и DATA-JPA).</li>
        <li>2.2 Работать с реализацией CRUD через интерфейс, который не должен ничего знать о деталях реализации (Map, DB или
            что-то еще).</li>
        <li>2.3 Добавить поле <code>id</code> в <code>Meal/ MealTo</code> и реализовать генерацию счетчика, УЧЕСТЬ МНОГОПОТОЧНОСТЬ
            СЕРВЛЕТОВ
            <ul>
                <li><a href="https://habrahabr.ru/company/luxoft/blog/157273/" rel="nofollow">обзор java.util.concurrent</a></li>
            </ul>
        </li>
        <li>2.4 Сделать форму редактирования в JSP: AJAX/JavaScript использовать НЕ надо, делаем через <code>&lt;form method="
            post"&gt;</code> и <code>doPost()</code> в сервлете.</li>
        <li>2.5 Для ввода дат и времени можно использовать <a href="https://webref.ru/html/input/type" rel="nofollow">html5
            типы</a>, хотя они поддерживаются не всеми браузерами (<a href="https://robertnyman.com/html5/forms/input-types.html" rel="nofollow">протестировать свой
            браузер</a>). В конце курса мы добавим <a href="http://xdsoft.net/jqplugins/datetimepicker/" rel="nofollow">
            DateTimePicker jQuery plugin</a>, который будет работать на всех браузерах.</li>
        <li>2.6 Форму на create-update предлагаю не дублировать, сделать одну (хотя это не ошибка сделать разные).</li>
    </ul>
    <h2>
        <a id="user-content-после-выполнения-дз-обязательно-проверьте-решение-на-ошибки" class="anchor" aria-hidden="true" href="#после-выполнения-дз-обязательно-проверьте-решение-на-ошибки">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        После выполнения ДЗ обязательно <a href="/JavaWebinar/topjava/blob/doc/doc/lesson01.md#-Типичные-ошибки">проверьте
        решение на ошибки</a>
    </h2>
    <h3>
        <a id="user-content--вопросы-по-hw1" class="anchor" aria-hidden="true" href="#-вопросы-по-hw1">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672858/9cd58692-e6e7-11e5-905d-c295d2a456f1.png" alt="question" style="max-width:100%;"></a>
            Вопросы по HW1
    </h3>
    <blockquote>
        <p>Не попадаю на страничку/брекпойнт в сервлете.</p>
    </blockquote>
    <ul>
        <li>внимательно проверь url и applicationContext (Application Context должен быть тот же, что и url
            приложения: <a href="https://github.com/JavaOPs/topjava/wiki/IDEA#%D0%94%D0%B5%D0%BF%D0%BB%D0%BE%D0%B9-war-%D0%B2-tomcat-application-context-%D0%B4%D0%BE%D0%BB%D0%B6%D0%B5%D0%BD-%D0%B1%D1%8B%D1%82%D1%8C-%D1%82%D0%BE%D1%82-%D0%B6%D0%B5-%D1%87%D1%82%D0%BE-%D0%B8-url-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B4%D0%B5%D0%BF%D0%BB%D0%BE%D0%B8%D1%82%D1%8C-%D0%BD%D0%B0%D0%B4%D0%BE-war-exploded">
            wiki IDEA</a>)</li>
        <li>посмотрите в task manager: возможно запущено несколько JVM и они мешают друг другу. Лишние java приложения
            убить.</li>
    </ul>
    <blockquote>
        <p>Приложение не видит TOPJAVA_ROOT.</p>
    </blockquote>
    <p><strong>После выставления переменной окружения IDEA нужно рестартовать. Слеши в пути должны быть в стиле unix (
        /)</strong>. Проверить, видит ли java переменную окружения можно так: <code>System.getenv("TOPJAVA_ROOT")</code>. Еще
        вариант: добавить <code>-DTOPJAVA_ROOT=...</code> в опции запуска приложения, тогда она доступна из java как <code>
        System.getProperty("TOPJAVA_ROOT")</code>.</p>
    <blockquote>
        <p>Проблемы с кодировкой в POST (кракозябры).</p>
    </blockquote>
    <p>Возможное решение - выставьте кодировку ДО первого чтения из request:</p>
    <pre><code>protected void doPost(HttpServletRequest request, ...) { request.setCharacterEncoding("UTF-8");</code></pre>
    <blockquote>
        <p>Если сервлет тыкают несколько пользователей / несколько браузеров, какого должно быть поведение? Нужно ли что-то
            делать с сессиями?</p>
    </blockquote>
    <p>В Optional нужно делать реализацию хранения многопоточной. Cессии пока не используем  (начнутся, когда будет
    прикручивать авторизацию).</p>
    <blockquote>
        <p>Для чего нам нужна многопоточная реализация коллекции, если каждый пользователь видит только себя?</p>
    </blockquote>
    <p>Реализация хранения в памяти у нас одна на всех. Те коллекция шарится между пользователями, а они в разных потоках ее
        дергают. Если несколько потоков одновременно будут изменять коллекцию без учета многопоточности (например один будет
        удалять, второй вставлять), мы получим <code>ConcurrentModificationException</code></p>
    <blockquote>
        <p>Предпочтительнее ли создавать новый объект <code>Meal</code> при каждом update?</p>
    </blockquote>
    <p>Если при обновлении не создавать копию, то сохраненный в памяти объект может кто-то попортить. Вопрос скорее доверия
        к коду- если проект большой и людей над ним трудится много, то вероятнее нужно копировать.</p>
    <blockquote>
        <p>Почему теряются атрибуты при передаче на сервлет: <code>http://localhost:8080/topjava/meals?action=add&amp;...</code>
            и <code>req.getAttribute("action")</code> = null ?</p>
    </blockquote>
    <p>См. <a href="http://stackoverflow.com/questions/5243754/difference-between-getattribute-and-getparameter" rel="nofollow">
        Difference between getAttribute() and getParameter()</a>. Отсюда также следует, что при редиректе атрибуты теряются.</p>
    <blockquote>
        <p>Зачем нужен в jsp <code>&lt;jsp:useBean id=".." scope="request" type=".."/&gt;</code> ?</p>
    </blockquote>
    <p><a href="http://java-online.ru/jsp-actions.xhtml#useBean" rel="nofollow">jsp:useBean</a> нужен IDEA для
        автодополнений - она понимает тип переменной, которая уже доступна в JSP (например через setAttribute). И еще эта
        переменная становится доступной в java вставках. Для вывода в JSP это тэг не обязателен. Если тип переменной JSP не
        совпадает с тем, что в <code>jsp:useBean</code>, будет ошибка.</p>
    <hr>
    <h3>
        <a id="user-content-итоги-занятия-после-выполнения-дз" class="anchor" aria-hidden="true" href="#итоги-занятия-после-выполнения-дз">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        Итоги занятия после выполнения ДЗ:
    </h3>
    <p>Мы создали CRUD веб-приложение для управления едой (создание-чтение-обновление-удаление) с использованием сервлетов и
        логированием. Пока в памяти, и пока еда никому не принадлежит. Пример выполнения ДЗ (не надо сложного интерфейса,
        Bootstrap css будем проходить на 8-м занятии):
    </p>
    <p><a target="_blank" rel="noopener noreferrer" href="https://user-images.githubusercontent.com/13649199/94701494-6100c800-0345-11eb-9907-2a0099305710.png"><img src="https://user-images.githubusercontent.com/13649199/94701494-6100c800-0345-11eb-9907-2a0099305710.png" alt="image" style="max-width:100%;"></a>
        <a target="_blank" rel="noopener noreferrer" href="https://user-images.githubusercontent.com/13649199/94701688-9a393800-0345-11eb-9c2d-dd53ba55724c.png"><img src="https://user-images.githubusercontent.com/13649199/94701688-9a393800-0345-11eb-9c2d-dd53ba55724c.png" alt="image" style="max-width:100%;"></a>
    </p>
    <h3>
        <a id="user-content--типичные-ошибки" class="anchor" aria-hidden="true" href="#-типичные-ошибки">
            <svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true">
                <path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path>
            </svg>
        </a>
        <a target="_blank" rel="noopener noreferrer" href="https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png"><img src="https://cloud.githubusercontent.com/assets/13649199/13672935/ef09ec1e-e6e7-11e5-9f79-d1641c05cbe6.png" alt="error" style="max-width:100%;"></a>
            Типичные ошибки
    </h3>
    <ul>
        <li>1 <strong>Если в названии класса есть <code>Meal</code>, не нужно использовать слово meal в методах
            класса.</strong></li>
        <li>2 Привыкайте писать комментарии к чекину: одной фразой что вы сделали в нем. Например: <em>Meals CRUD
            implementation</em>. См.
            <a href="https://habr.com/ru/post/416887/" rel="nofollow">Как писать сообщения коммитов</a>
        </li>
        <li>3 Хранение в памяти и операции с ней должны выполняться просто и эффективно</li>
        <li>4 Хранить нужно <code>Meal</code> и конвертировать ее в <code>MealTo</code> когда отдаем список на отображение в JSP.
            <ul>
                <li>excess нужно пересчитывать каждый раз перед отображением</li>
                <li>форматирование должно находится в JSP! Именно он заведует отображением. Повторяем
                    паттерн <a href="https://ru.wikipedia.org/wiki/Model-View-Controller" rel="nofollow">MVC</a></li>
            </ul>
        </li>
        <li>5 Стили <code>color</code> можно применять ко всей строке таблицы <code>tr</code>, а не каждой ячейке.</li>
        <li>6 <code>DateTimeFormatter</code> можно сделать один заранее (он потокобезопасный в отличие от <code>
            SimpleDateFormatter</code>), а не создавать новый при каждом запросе.</li>
        <li>7 Работать с CRUD надо через интерфейс.</li>
        <li>8 Реализаций хранения будет несколько, нужно учитывать это в названии класса имплементации работы в памяти.</li>
        <li>9 В <code>web.xml</code> принято группировать сервлет со своим маппингом</li>
        <li>10 Не размещайте никакую логику (форматирование, счетчики) в бинах, где хранятся только данные (<code>Meal,
            MealTo</code>)</li>
        <li>11 Еще раз: детали реализации в памяти не должны быть никому видны. Те НЕ НАДО счетчик размещать в <code>Meal</code>
            или <code>MealServlet</code> или <code>MealsUtil</code>, в базе же он будет по другому генерится.</li>
        <li>12 <code>volatile</code> при ++ не помогает от многопоточности. Почему?</li>
        <li>13 Обратите также внимание на то, чтобы реализация вашей коллекции для хранения еды была также многопоточной.</li>
        <li>14 Не делайте дублирование кода <code>MealsUtil</code>. Возможно вам пригодятся константы <code>LocalTime.MIN</code>
            и <code>LocalTime.MAX</code></li>
        <li>15 Не дублируйте строки в <code>jsp</code>. Посмотрите
            на <a href="https://steveswinsburg.wordpress.com/2008/09/04/the-ternary-operator-and-jsp/" rel="nofollow">тернарный
            оператор</a>.</li>
        <li>16 После операции <code>delete</code> в браузере должен быть url <code>http:\\localhost:
            8080\topjava\meals</code></li>
        <li>17 Перед чекином проверяйте свой ченджлист (<code>Ctrl+D</code> на файле из <code>Local Changes</code> - посмотреть
            что поменялось). Если там только пробелы/переводы строк, не надо его комитить - делайте файлу <code>
            Git-&gt;revert</code>.</li>
        <li>18 Учтите в названии реализации CRUD, что
            <ul>
                <li>18.1 у нас будет несколько реализаций (не только в памяти)</li>
                <li>18.2 у нас будет 2 CRUD (для еды и пользователей). А в реальном проекте их намного больше.</li>
            </ul>
        </li>
        <li> 19 Сессии НЕ использовать! При редиректе все атрибуты (<code>req.getAttribute()</code>) теряются (см. вопрос выше).
            Сценарий редиректа:
            <ul>
                <li>1 из сервлета делаем редирект (снова на сервлет, не на JSP!)</li>
                <li>2 снова заходим в сервлет</li>
                <li>3 кладем нужные атрибуты и делаем forward на jsp</li>
                <li>4 если очень хочется передать параметры из 1. в 2. можно сделать их через параметры запроса (например <code>
                    meals?id=5</code>) и доставать через <code>reg.getParameter(id)</code>. В моей реализации такого не потребовалось.</li>
            </ul>
        </li>
    </ul>
</article>