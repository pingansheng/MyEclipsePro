/**
 * @global jQuery
 * @type jQuery
 * @property
 */
var jQuery;

/**
 * Selects elements.
 * @param {String} selector
 * @type jQuery
 */
function jQuery(selector){
	return new jQuery();
}

/**
 * Selects elements.
 * @param {String} selector
 * @type jQuery
 */
function $(selector){
	return new jQuery();
}

/**
 * This function accepts a string containing a CSS selector which is then used to match a set of elements.The core functionality of jQuery centers around this function. Everything in jQuery is based upon this, or uses this in some way. The most basic use of this function is to pass in an expression (usually consisting of CSS), which then finds all matching elements. By default, if no context is specified, $() looks for DOM elements within the context of the current HTML document. If you do specify a context, such as a DOM element or jQuery object, the expression will be matched against the contents of that context. See<a href='Selectors'>Selectors</a> for the allowed CSS syntax for expressions. * @code $("div", xml.responseXML);
 * @param {String} expression An expression to search with.
 * @param {String} expression An expression to search with.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.jQuery = function(expression){return new Object()};

/**
 * Create DOM elements on-the-fly from the provided String of raw HTML.You can pass in plain HTML Strings written by hand, create them using some template engine or plugin, or load them via AJAX. There are limitations when creating input elements, see the second example. Also when passing strings that may include slashes (such as an image path), escape the slashes. When creating single elements use the closing tag or XHTML format. For example, to create a span use $("<span/>") or $("<span></span>") instead of without the closing slash/tag. * @code // Does NOT work in IE:$("<input/>").attr("type", "checkbox");// Does work in IE:$("<input type='checkbox'/>");
 * @param {String} html A string of HTML to create on the fly.
 * @param {String} html A string of HTML to create on the fly.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.jQuery = function(html, ownerDocument){return new Object()};

/**
 * Wrap jQuery functionality around a single or multiple DOM Element(s).This function also accepts XML Documents and Window objects as valid arguments (even though they are not DOM Elements). * @code $(myForm.elements).hide()
 * @param {Element, Array<Element>} elements DOM element(s) to be encapsulated by a jQuery object.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.jQuery = function(){return new Object()};

/**
 * A shorthand for $(document).ready().Allows you to bind a function to be executed when the DOM document has finished loading. This function behaves just like $(document).ready(), in that it should be used to wrap other $() operations on your page that depend on the DOM being ready to be operated on. While this function is, technically, chainable - there really isn't much use for chaining against it. You can have as many $(document).ready events on your page as you like. See ready(Function) for details about the ready event. * @code jQuery(function($) {  // Your code using failsafe $ alias here...});
 * @param {Function} callback The function to execute when the DOM is ready.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.jQuery = function(callback){return new Object()};

/**
 * Execute a function within the context of every matched element.This means that every time the passed-in function is executed (which is once for every element matched) the 'this' keyword points to the specific DOM element. Additionally, the function, when executed, is passed a single argument representing the position of the element in the matched set (integer, zero-index). Returning 'false' from within the each function completely stops the loop through all of the elements (this is like using a 'break' with a normal loop). Returning 'true' from within the loop skips to the next iteration (this is like using a 'continue' with a normal loop). * @code $("button").click(function () {      $("div").each(function (index, domEle) {        // domEle == this        $(domEle).css("backgroundColor", "yellow");         if ($(this).is("#stop")) {          $("span").text("Stopped at div index #" + index);          return false;        }      });    });
 * @param {Function} callback The callback to execute for each matched element.<pre>function callback(index, domElement) {  this; // this == domElement}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.each = function(callback){return new Object()};

/**
 * The number of elements in the jQuery object.The number of elements currently matched. The<a href='Core/size'>size</a> function will return the same value. * @code $(document.body).click(function () {      $(document.body).append($("<div>"));      var n = $("div").length;      $("span").text("There are " + n + " divs." +                     "Click to add more.");    }).trigger('click'); // trigger the click to start
 * @type Number
 * @property 
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.length = new Object();

/**
 * Reduce the set of matched elements to a single element.The position of the element in the set of matched elements starts at 0 and goes to length - 1. * @code $("p").eq(1).css("color", "red")
 * @param {Number} position The index of the element to select.
 * @type jQuery
 * @since 1.0
 * @removed 1.2
 * @deprecated <a href='Traversing/slice'>slice</a>
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.eq = function(position){return new Object()};

/**
 * Access all matched DOM elements.This serves as a backwards-compatible way of accessing all matched elements (other than the jQuery object itself, which is, in fact, an array of elements). It is useful if you need to operate on the DOM elements themselves instead of using built-in jQuery functions. * @code function disp(divs) {      var a = [];      for (var i = 0; i < divs.length; i++) {        a.push(divs[i].innerHTML);      }      $("span").text(a.join(" "));    }        disp( $("div").get().reverse() );
 * @type Array<Element>
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.get = function(){return new Object()};

/**
 * Access a single matched DOM element at a specified index in the matched set.This allows you to extract the actual DOM element and operate on it directly without necessarily using jQuery functionality on it. This function called as $(this).get(0) is the equivalent of using square bracket notation on the jQuery object itself like $(this)[0]. * @code $("*", document.body).click(function (e) {      e.stopPropagation();      var domEl = $(this).get(0);      $("span:first").text("Clicked on - " + domEl.tagName);    });
 * @param {Number} index Access the element in the Nth position.
 * @type Element
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.get = function(index){return new Object()};

/**
 * Searches every matched element for the object and returns the index of the element, if found, starting with zero.Returns -1 if the object wasn't found. * @code $("*").index( $('#bar')[0] )
 * @param {Element } subject Object to search for.
 * @type Number
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.index = function(){return new Object()};

/**
 * Returns value at named data store for the element, as set by data(name, value).<p>If the jQuery collection references multiple elements, the value returned refers to the first element.</p><p>This function is used to get stored data on an element without the risk of a circular reference. It uses jQuery.data and is new to version 1.2.3. It can be used for many reasons and jQuery UI uses it heavily. </p> * @code $("button").click(function(e) {      var value; *       switch ($("button").index(this)) {        case 0 :          value = $("div").data("blah");          break;        case 1 :          $("div").data("blah", "hello");          value = "Stored!";          break;        case 2 :          $("div").data("blah", 86);          value = "Stored!";          break;        case 3 :          $("div").removeData("blah");          value = "Removed!";          break;      } *       $("span").text("" + value);    });
 * @param {String} name Name of the data stored.
 * @type Any
 * @since 1.2.3
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.data = function(name){return new Object()};

/**
 * Stores the value in the named spot and also returns the value.<p>If the jQuery collection references multiple elements, the data element is set on all of them.</p><p>This function can be useful for attaching data to elements without having to create a new expando. It also isn't limited to a string. The value can be any format.</p> * @code $("div").data("test", { first: 16, last: "pizza!" });    $("span:first").text($("div").data("test").first);    $("span:last").text($("div").data("test").last);
 * @param {String} name Name of the data to store.
 * @param {String} name Name of the data to store.
 * @type Any
 * @since 1.2.3
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.data = function(name, value){return new Object()};

/**
 * Removes named data store from an element.This is the complement function to $(...).data(name, value). * @code $("span:eq(0)").text("" + $("div").data("test1"));    $("div").data("test1", "VALUE-1");    $("div").data("test2", "VALUE-2");    $("span:eq(1)").text("" + $("div").data("test1"));    $("div").removeData("test1");    $("span:eq(2)").text("" + $("div").data("test1"));    $("span:eq(3)").text("" + $("div").data("test2"));
 * @param {String} name The name of the data store property to remove.
 * @type jQuery
 * @since 1.2.3
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.removeData = function(name){return new Object()};

/**
 * Extends the jQuery element set to provide new methods (used to make a typical jQuery plugin).Can be used to add functions into the to add<a href='Plugins/Authoring'>plugin methods (plugins)</a> . * @code jQuery.fn.extend({  check: function() {    return this.each(function() { this.checked = true; });  },  uncheck: function() {    return this.each(function() { this.checked = false; });  }});
 * @param {Object} object The object that will be merged into the jQuery object.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.fn.prototype.extend = function(object){return new Object()};

/**
 * Extends the jQuery object itself.Can be used to add functions into the jQuery namespace. See<a href='Core/jQuery.fn.extend'>jQuery.fn.extend</a> for more information on using this method to add<a href='Plugins/Authoring'>Plugins</a> . * @code jQuery.extend({  min: function(a, b) { return a < b ? a : b; },  max: function(a, b) { return a > b ? a : b; }});
 * @param {Object} object The object that will be merged into the jQuery object.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.extend = function(object){return new Object()};

/**
 * Run this function to give control of the $ variable back to whichever library first implemented it.This helps to make sure that jQuery doesn't conflict with the $ object of other libraries. By using this function, you will only be able to access jQuery using the 'jQuery' variable. For example, where you used to do $("div p"), you now must do jQuery("div p"). '''NOTE:''' This function must be called after including the jQuery javascript file, but '''before''' including any other conflicting library, and also before actually that other conflicting library gets used, in case jQuery is included last. noConflict can be called at the end of the jQuery.js file to globally disable the $() jQuery alias. jQuery.noConflict returns a reference to jQuery, so it can be used to override the $() alias of the jQuery object. * @code var j = jQuery.noConflict();// Do something with jQueryj("div p").hide();// Do something with another library's $()$("content").style.display = 'none';
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.noConflict = function(){return new Object()};

/**
 * Revert control of both the $ and jQuery variables to their original owners. '''Use with discretion.'''This is a more-extreme version of the simple<a href='Core/jQuery.noConflict'>noConflict</a> method, as this one will completely undo what jQuery has introduced. This is to be used in an extreme case where you'd like to embed jQuery into a high-conflict environment. '''NOTE:''' It's very likely that plugins won't work after this particular method has been called. * @code var dom = {};dom.query = jQuery.noConflict(true);
 * @param {Boolean} extreme Set to true to enable the extreme rollback of jQuery and its variables.
 * @type jQuery
 * @since 1.1.4
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.noConflict = function(extreme){return new Object()};

/**
 * Access a property on the first matched element. This method makes it easy to retrieve a property value from the first matched element. If the element does not have an attribute with such a name, undefined is returned. Attributes include title, alt, src, href, width, style, etc. *  * @code var title = $("em").attr("title");    $("div").text(title);
 * @param {String} name The name of the property to access.
 * @type Object
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.attr = function(name){return new Object()};

/**
 * Set a key/value object as properties to all matched elements.This serves as the best way to set a large number of properties on all matched elements. Note that you must use 'className' as key if you want to set the class-Attribute. Or use .addClass( class ) or .removeClass( class ). Keep in mind this recursively calls attr( key, value ) or attr ( key, fn ), so if one of the properties you are passing is a function, the function will be evaluated and not stored as the attribute itself. * @code $("img").attr({           src: "/images/hat.gif",          title: "jQuery",          alt: "jQuery Logo"        });    $("div").text($("img").attr("alt"));
 * @param {Map} properties Key/value pairs to set as object properties.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.attr = function(properties){return new Object()};

/**
 * Set a single property to a value, on all matched elements. *  * @code $("button:gt(1)").attr("disabled","disabled");
 * @param {String} key The name of the property to set.
 * @param {String} key The name of the property to set.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.attr = function(key, value){return new Object()};

/**
 * Set a single property to a computed value, on all matched elements.Instead of supplying a string value as described<a href='#keyvalue'>above</a> , a function is provided that computes the value. * @code $("img").attr("src", function() {           return "/images/" + this.title;         });
 * @param {String} key The name of the property to set.
 * @param {String} key The name of the property to set.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.attr = function(key, fn){return new Object()};

/**
 * Remove an attribute from each of the matched elements. *  * @code $("button").click(function () {      $(this).next().removeAttr("disabled")             .focus()             .val("editable now");    });
 * @param {String} name The name of the property to remove.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.removeAttr = function(name){return new Object()};

/**
 * Adds the specified class(es) to each of the set of matched elements. *  * @code $("p:last").addClass("selected highlight");
 * @param {String} class One or more classes to add to the elements, these are separated by spaces.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.addClass = function(class){return new Object()};

/**
 * Returns true if the specified class is present on at least one of the set of matched elements. *  * @code $("div#result1").append($("p:first").hasClass("selected").toString());$("div#result2").append($("p:last").hasClass("selected").toString());$("div#result3").append($("p").hasClass("selected").toString());
 * @param {String} class One CSS class name to be checked for.
 * @type Boolean
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.hasClass = function(class){return new Object()};

/**
 * Removes all or the specified class(es) from the set of matched elements. *  * @code $("p:eq(1)").removeClass();
 * @param {String} class One or more CSS classes to remove from the elements, these are separated by spaces.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.removeClass = function(class){return new Object()};

/**
 * Adds the specified class if it is not present, removes the specified class if it is present. *  * @code $("p").click(function () {      $(this).toggleClass("highlight");    });
 * @param {String} class A CSS class to toggle on the elements.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.toggleClass = function(class){return new Object()};

/**
 * Get the html contents (innerHTML) of the first matched element. This property is not available on XML documents (although it will work for XHTML documents). *  * @code $("p").click(function () {      var htmlStr = $(this).html();      $(this).text(htmlStr);    });
 * @type String
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.html = function(){return new Object()};

/**
 * Set the html contents of every matched element. This property is not available on XML documents (although it will work for XHTML documents). *  * @code $("div").html("<b>Wow!</b> Such excitement...");    $("div b").append(document.createTextNode("!!!"))              .css("color", "red");
 * @param {String} val Set the html contents to the specified value.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.html = function(val){return new Object()};

/**
 * Get the combined text contents of all matched elements.The result is a string that contains the combined text contents of all matched elements. This method works on both HTML and XML documents. Cannot be used on input elements. For input field text use the<a href='Attributes/val#val'>val attribute</a> . * @code var str = $("p:first").text();    $("p:last").html(str);
 * @type String
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.text = function(){return new Object()};

/**
 * Set the text contents of all matched elements.Similar to html(), but escapes HTML (replace "<" and ">" with their HTML entities). Cannot be used on input elements. For input field text use the<a href='Attributes/val#val'>val attribute</a> . * @code $("p").text("<b>Some</b> new text.");
 * @param {String} val The text value to set the contents of the element to.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.text = function(val){return new Object()};

/**
 * Get the content of the value attribute of the first matched element.In jQuery 1.2, a value is now returned for all elements, including selects. For multiple selects an array of values is returned. For older versions of jQuery use the [http://www.malsup.com/jquery/form/#fields fieldValue function of the Form Plugin]. For selects and checkboxes, see the<a href='Selectors/selected'>:selected</a> and<a href='Selectors/checked'>:checked</a> selectors. * @code $("input").keyup(function () {      var value = $(this).val();      $("p").text(value);    }).keyup();
 * @type String|Array
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.val = function(){return new Object()};

/**
 * Set the value attribute of every matched element.In jQuery 1.2, this is also able to set the value of select elements, but selecting the appropriate options. * @code $("button").click(function () {      var text = $(this).text();      $("input").val(text);    });
 * @param {String} val The value to set on the matched element.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.val = function(val){return new Object()};

/**
 * Checks, or selects, all the radio buttons, checkboxes, and select options that match the set of values. *  * @code $("#single").val("Single2");    $("#multiple").val(["Multiple2", "Multiple3"]);    $("input").val(["check1","check2", "radio1" ]);
 * @param {Array<String>} val The set of values to check/select.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.val = function(val){return new Object()};

/**
 * Reduce the set of matched elements to a single element.Argument is the position of the element in the set of matched elements, starting at 0 and going to length - 1. Since the query filters out all elements that do not match the given index, providing an invalid index returns an empty set of elements rather than null. * @code $("div").eq(2).addClass("blue");
 * @param {Integer} index The index of the element in the jQuery object.
 * @type jQuery
 * @since 1.1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.eq = function(index){return new Object()};

/**
 * Checks the current selection against a class and returns true, if at least one element of the selection has the given class.This is an alternative to is("." + class). * @code $("div").click(function(){      if ( $(this).hasClass("protected") )        $(this).animate({ left: -10 }, 75)               .animate({ left: 10 }, 75)               .animate({ left: -10 }, 75)               .animate({ left: 10 }, 75)               .animate({ left: 0 }, 75);    });
 * @param {String} class The class to match.
 * @type Boolean
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.hasClass = function(class){return new Object()};

/**
 * Removes all elements from the set of matched elements that do not match the specified expression(s).This method is used to narrow down the results of a search. Provide a comma-separated list of expressions to apply multiple filters at once. * @code $("p").filter(".selected, :first")
 * @param {Expression} expr An expression to pass into the filter
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.filter = function(expr){return new Object()};

/**
 * Removes all elements from the set of matched elements that do not match the specified function.The function is called with a context equal to the current element (just like<a href='Core/each'>$.each</a> ). If the function returns false, then the element is removed - anything else and the element is kept. * @code $("p").filter(function(index) {   return $("ol", this).length == 0; });
 * @param {Function} fn A function to pass into the filter<pre>function callback(indexInJQueryObject) {  var keepItBoolean = true; *   this; // dom element *   return keepItBoolean;}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.filter = function(fn){return new Object()};

/**
 * Checks the current selection against an expression and returns true, if at least one element of the selection fits the given expression.If no element fits, or the expression is not valid, then the response will be 'false'. '''Note''': Only ''simple'' expressions are supported. Complex expressions, such as those containing hierarchy selectors (such as +, ~, and >) will always return 'true'.<a href='Traversing/filter'>filter</a> is used internally, therefore all rules that apply there apply here, as well. * @code var isFormParent = $("input[@type='checkbox']").parent().is("form")    $("div").text("isFormParent = " + isFormParent);
 * @param {String} expr The expression with which to filter
 * @type Boolean
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.is = function(expr){return new Object()};

/**
 * Translate a set of elements in the jQuery object into another set of values in an array (which may, or may not, be elements).You could use this to build lists of values, attributes, css values - or even perform special, custom, selector transformations. This is provided as a convenience method for using<a href='Utilities/jQuery.map'>$.map()</a> . * @code var mappedItems = $("li").map(function (index) {      var replacement = $("<li>").text($(this).text()).get(0);      if (index == 0) {        // make the first item all caps        $(replacement).text($(replacement).text().toUpperCase());      } else if (index == 1 || index == 3) {        // delete the second and fourth items        replacement = null;      } else if (index == 2) {        // make two of the third item and add some text        replacement = [replacement,$("<li>").get(0)];        $(replacement[0]).append("<b> - A</b>");        $(replacement[1]).append("Extra <b> - B</b>");      } *       // replacment will be an dom element, null,       // or an array of dom elements      return replacement;    });    $("#results").append(mappedItems);
 * @param {Function} callback The function to execute on each element in the set.<pre>function callback(index, domElement) {  var replacement; *   this; // also dom element *   // replacement == null : delete spot  // replacement == array : insert the elements of the array  // else replace the spot with replacement  return replacement;}</pre>
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.map = function(callback){return new Object()};

/**
 * Removes elements matching the specified expression from the set of matched elements. *  * @code $("p").not($("div p.selected"))
 * @param {String, DOMElement, Array<DOMElement>} expr An expression with which to remove matching elements, an element to remove from the set or a set of elements to remove from the jQuery set of matched elements.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.not = function(){return new Object()};

/**
 * Selects a subset of the matched elements.Behaves exactly like the built-in Array slice method. * @code $("p").slice(-1).wrapInner("<b></b>");
 * @param {Integer} start Where to start the subset. The first element is at zero. Can be negative to start from the end of the selection.
 * @param {Integer} start Where to start the subset. The first element is at zero. Can be negative to start from the end of the selection.
 * @type jQuery
 * @since 1.1.4
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.slice = function(start, end){return new Object()};

/**
 * Adds more elements, matched by the given expression, to the set of matched elements. *  * @code $("p").add(document.getElementById("a")).css("background", "yellow");
 * @param {String, DOMElement, Array<DOMElement>} expr An expression whose matched elements are added for String, a string of HTML to create on the fly for DOMElement or one or more Elements to add if an Array.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.add = function(){return new Object()};

/**
 * Get a set of elements containing all of the unique immediate children of each of the matched set of elements.This set can be filtered with an optional expression that will cause only elements matching the selector to be collected. Also note: while parents() will look at all ancestors, children() will only consider immediate child elements. * @code $("div").children(".selected").css("color", "blue");
 * @param {String} expr An expression to filter the child Elements with.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.children = function(expr){return new Object()};

/**
 * Find all the child nodes inside the matched elements (including text nodes), or the content document, if the element is an iframe. *  * @code $("iframe").contents().find("body").append("I'm in an iframe!");
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.contents = function(){return new Object()};

/**
 * Searches for all elements that match the specified<a href='Selectors'>expression</a> . This method is a good way to find additional descendant elements with which to process.All searching is done using a<a href='Selectors'>jQuery expression</a> . The expression can be written using CSS 1-3 Selector syntax. * @code var newText = $("p").text().split(" ").join("</span> <span>");    newText = "<span>" + newText + "</span>"; *     $("p").html(newText)          .find("span")            .hover(function () { $(this).addClass("hilite"); },                   function () { $(this).removeClass("hilite"); })          .end()          .find(":contains('t')")            .css({"font-style":"italic", "font-weight":"bolder"});
 * @param {String} expr An expression to search with.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.find = function(expr){return new Object()};

/**
 * Get a set of elements containing the unique next siblings of each of the given set of elements.next only returns the very next sibling for each element, not all next siblings (see nextAll). You may provide an optional expression to filter the returned set. * @code $("p").next(".selected").css("background", "yellow");
 * @param {String} expr An expression with which to filter the returned set.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.next = function(expr){return new Object()};

/**
 * Find all sibling elements after the current element.Use an optional expression to filter the matched set. * @code $(":nth-child(1)").nextAll("p").addClass("after");
 * @param {String} expr An expression to filter the next Elements with.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.nextAll = function(expr){return new Object()};

/**
 * Returns a jQuery collection with the positioned parent of the first matched element.This is the first parent of the element that has position (as in relative or absolute). This method only works with visible elements. * @type jQuery
 * @since 1.26
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.offsetParent = function(){return new Object()};

/**
 * Get a set of elements containing the unique parents of the matched set of elements.You may use an optional expression to filter the set of parent elements that will match. * @code $("p").parent(".selected").css("background", "yellow");
 * @param {String} expr An expression to filter the parents with.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.parent = function(expr){return new Object()};

/**
 * Get a set of elements containing the unique ancestors of the matched set of elements (except for the root element). The matched elements can be filtered with an optional expression. *  * @code function showParents() {      $("div").css("border-color", "white");      var len = $("span.selected")                       .parents("div")                       .css("border", "2px red solid")                       .length;      $("b").text("Unique div parents: " + len);    }    $("span").click(function () {      $(this).toggleClass("selected");      showParents();    });
 * @param {String} expr An expression to filter the ancestors with
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.parents = function(expr){return new Object()};

/**
 * Get a set of elements containing the unique previous siblings of each of the matched set of elements.Use an optional expression to filter the matched set. Only the immediately previous sibling is returned, not all previous siblings. * @code $("p").prev(".selected").css("background", "yellow");
 * @param {String} expr An expression to filter the previous Elements with.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.prev = function(expr){return new Object()};

/**
 * Find all sibling elements in front of the current element.Use an optional expression to filter the matched set. * @code $("div:last").prevAll().addClass("before");
 * @param {String} expr An expression to filter the previous elements with.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.prevAll = function(expr){return new Object()};

/**
 * Get a set of elements containing all of the unique siblings of each of the matched set of elements. Can be filtered with an optional expressions. *  * @code $("p").siblings(".selected").css("background", "yellow");
 * @param {String} expr An expression to filter the sibling Elements with
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.siblings = function(expr){return new Object()};

/**
 * Add the previous selection to the current selection.Useful for traversing elements, and then adding something that was matched before the last traversal. * @code $("div").find("p").andSelf().addClass("border");    $("div").find("p").addClass("background");
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.andSelf = function(){return new Object()};

/**
 * Revert the most recent 'destructive' operation, changing the set of matched elements to its previous state (right before the destructive operation).If there was no destructive operation before, an empty set is returned. A 'destructive' operation is any operation that changes the set of matched jQuery elements, which means any Traversing function that returns a jQuery object - including<a href='Traversing/add'>add</a> ,<a href='Traversing/andSelf'>andSelf</a> ,<a href='Traversing/children'>children</a> ,<a href='Traversing/filter'>filter</a> ,<a href='Traversing/find'>find</a> ,<a href='Traversing/map'>map</a> ,<a href='Traversing/next'>next</a> ,<a href='Traversing/nextAll'>nextAll</a> ,<a href='Traversing/not'>not</a> ,<a href='Traversing/parent'>parent</a> ,<a href='Traversing/parents'>parents</a> ,<a href='Traversing/prev'>prev</a> ,<a href='Traversing/prevAll'>prevAll</a> ,<a href='Traversing/siblings'>siblings</a> and<a href='Traversing/slice'>slice</a> - plus the<a href='Manipulation/clone'>clone</a> function (from Manipulation). * @code $("p").find("span").end().css("border", "2px red solid");
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.end = function(){return new Object()};

/**
 * Get the html contents (innerHTML) of the first matched element. This property is not available on XML documents (although it will work for XHTML documents). *  * @code $("p").click(function () {      var htmlStr = $(this).html();      $(this).text(htmlStr);    });
 * @type String
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.html = function(){return new Object()};

/**
 * Set the html contents of every matched element. This property is not available on XML documents (although it will work for XHTML documents). *  * @code $("div").html("<b>Wow!</b> Such excitement...");    $("div b").append(document.createTextNode("!!!"))              .css("color", "red");
 * @param {String} val Set the html contents to the specified value.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.html = function(val){return new Object()};

/**
 * Get the combined text contents of all matched elements.The result is a string that contains the combined text contents of all matched elements. This method works on both HTML and XML documents. Cannot be used on input elements. For input field text use the<a href='Attributes/val#val'>val attribute</a> . * @code var str = $("p:first").text();    $("p:last").html(str);
 * @type String
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.text = function(){return new Object()};

/**
 * Set the text contents of all matched elements.Similar to html(), but escapes HTML (replace "<" and ">" with their HTML entities). Cannot be used on input elements. For input field text use the<a href='Attributes/val#val'>val attribute</a> . * @code $("p").text("<b>Some</b> new text.");
 * @param {String} val The text value to set the contents of the element to.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.text = function(val){return new Object()};

/**
 * Append content to the inside of every matched element.This operation is similar to doing an appendChild to all the specified elements, adding them into the document. * @code $("p").append( $("b") );
 * @param {String, Element, jQuery} content Content to append to the target.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.append = function(){return new Object()};

/**
 * Append all of the matched elements to another, specified, set of elements.This operation is, essentially, the reverse of doing a regular $(A).append(B), in that instead of appending B to A, you're appending A to B. * @code $("span").appendTo("#foo"); // check append() examples
 * @param {String} content target to which the content will be appended.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.appendTo = function(content){return new Object()};

/**
 * Prepend content to the inside of every matched element.This operation is the best way to insert elements inside, at the beginning, of all matched elements. * @code $("p").prepend( $("b") );
 * @param {String, Element, jQuery} content Content to prepend to the target.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.prepend = function(){return new Object()};

/**
 * Prepend all of the matched elements to another, specified, set of elements.This operation is, essentially, the reverse of doing a regular $(A).prepend(B), in that instead of prepending B to A, you're prepending A to B. * @code $("span").prependTo("#foo"); // check prepend() examples
 * @param {String} content target to which the content will be prepended.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.prependTo = function(content){return new Object()};

/**
 * Insert content after each of the matched elements. *  * @code $("p").after( $("b") );
 * @param {String, Element, jQuery} content Content to insert after each target.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.after = function(){return new Object()};

/**
 * Insert content before each of the matched elements. *  * @code $("p").before( $("b") );
 * @param {String, Element, jQuery} content Content to insert before each target.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.before = function(){return new Object()};

/**
 * Insert all of the matched elements after another, specified, set of elements.This operation is, essentially, the reverse of doing a regular $(A).after(B), in that instead of inserting B after A, you're inserting A after B. * @code $("p").insertAfter("#foo"); // check after() examples
 * @param {String} content Content after which the selected element(s) is inserted.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.insertAfter = function(content){return new Object()};

/**
 * Insert all of the matched elements before another, specified, set of elements.This operation is, essentially, the reverse of doing a regular $(A).before(B), in that instead of inserting B before A, you're inserting A before B. * @code $("p").insertBefore("#foo"); // check before() examples
 * @param {String} content Content after which the selected element(s) is inserted.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.insertBefore = function(content){return new Object()};

/**
 * Wrap each matched element with the specified HTML content.This wrapping process is most useful for injecting additional structure into a document, without ruining the original semantic qualities of a document. This works by going through the first element provided (which is generated, on the fly, from the provided HTML) and finds the deepest descendant element within its structure -- it is that element that will enwrap everything else. * @code $("span").wrap("<div><div><p><em><b></b></em></p></div></div>");
 * @param {String} html A string of HTML that will be created on the fly and wrapped around each target.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrap = function(html){return new Object()};

/**
 * Wrap each matched element with the specified element. *  * @code $("p").wrap($(".doublediv"));
 * @param {Element} elem A DOM element that will be wrapped around each target.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrap = function(elem){return new Object()};

/**
 * Wrap all the elements in the matched set into a single wrapper element.This is different from<a href='Manipulation/wrap'>.wrap()</a> where each element in the matched set would get wrapped with an element. This wrapping process is most useful for injecting additional structure into a document, without ruining the original semantic qualities of a document. This works by going through the first element provided (which is generated, on the fly, from the provided HTML) and finds the deepest descendant element within its structure -- it is that element that will enwrap everything else. * @code $("span").wrapAll("<div><div><p><em><b></b></em></p></div></div>");
 * @param {String} html A string of HTML that will be created on the fly and wrapped around the target.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrapAll = function(html){return new Object()};

/**
 * Wrap all the elements in the matched set into a single wrapper element.This is different from<a href='Manipulation/wrap'>.wrap()</a> where each element in the matched set would get wrapped with an element. * @code $("p").wrapAll($(".doublediv"));
 * @param {Element} elem A DOM element that will be wrapped around the target.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrapAll = function(elem){return new Object()};

/**
 * Wrap the inner child contents of each matched element (including text nodes) with an HTML structure.This wrapping process is most useful for injecting additional structure into a document, without ruining the original semantic qualities of a document. This works by going through the first element provided (which is generated, on the fly, from the provided HTML) and finds the deepest ancestor element within its structure -- it is that element that will enwrap everything else. * @code $("body").wrapInner("<div><div><p><em><b></b></em></p></div></div>");
 * @param {String} html A string of HTML that will be created on the fly and wrapped around the target.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrapInner = function(html){return new Object()};

/**
 * Wrap the inner child contents of each matched element (including text nodes) with a DOM element. *  * @code $("p").wrapInner($("<span class='red'></span>"));
 * @param {Element} elem A DOM element that will be wrapped around the target.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.wrapInner = function(elem){return new Object()};

/**
 * Replaces all matched elements with the specified HTML or DOM elements. This returns the JQuery element that was just replaced, which has been removed from the DOM. *  * @code $("p").click(function () {      $(this).replaceWith($("div"));    });
 * @param {String, Element, jQuery} content Content to replace the matched elements with.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.replaceWith = function(){return new Object()};

/**
 * Replaces the elements matched by the specified selector with the matched elements.This function is the complement to replaceWith() which does the same task with the parameters reversed. * @code $("<b>Paragraph. </b>").replaceAll("p"); // check replaceWith() examples
 * @param {Selector} selector The elements to find and replace the matched elements with.
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.replaceAll = function(selector){return new Object()};

/**
 * Remove all child nodes from the set of matched elements.Note that this function starting with 1.2.2 will also remove all event handlers and internally cached data. * @code $("button").click(function () {      $("p").empty();    });
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.empty = function(){return new Object()};

/**
 * Removes all matched elements from the DOM.This does NOT remove them from the jQuery object, allowing you to use the matched elements further. Note that this function starting with 1.2.2 will also remove all event handlers and internally cached data. So: <code> $("#foo").remove().appendTo("#bar"); </code> should be written as <code> $("#foo").appendTo("#bar"); </code> to avoid losing the event handlers. Can be filtered with an optional expression. * @code $("button").click(function () {      $("p").remove(":contains('Hello')");    });
 * @param {String} expr A jQuery expression to filter the set of elements to be removed.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.remove = function(expr){return new Object()};

/**
 * Clone matched DOM Elements and select the clones.This is useful for moving copies of the elements to another location in the DOM. * @code $("b").clone().prependTo("p");
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.clone = function(){return new Object()};

/**
 * Clone matched DOM Elements, and all their event handlers, and select the clones.This is useful for moving copies of the elements, and their events, to another location in the DOM. * @code $("button").click(function(){      $(this).clone(true).insertAfter(this);    });
 * @param {Boolean} true Set to true to enable cloning of event handlers.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.clone = function(arg){return new Object()};

/**
 * Return a style property on the first matched element. *  * @code $("div").click(function () {      var color = $(this).css("background-color");      $("#result").html("That div is <span style='color:" +                         color + ";'>" + color + "</span>.");    });
 * @param {String} name The name of the property to access.
 * @type String
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.css = function(name){return new Object()};

/**
 * Set a key/value object as style properties to all matched elements.This is the best way to set several style properties on all matched elements. * @code $("p").hover(function () {      $(this).css({ "background-color":"yellow", "font-weight":"bolder" });    }, function () {      var cssObj = {        "background-color": "#ddd",        "font-weight": "",        color: "rgb(0,40,244)"      }      $(this).css(cssObj);    });
 * @param {Map} properties Key/value pairs to set as style properties.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.css = function(properties){return new Object()};

/**
 * Set a single style property to a value on all matched elements.If a number is provided, it is automatically converted into a pixel value. * @code var words = $("p:first").text().split(" ");    var text = words.join("</span> <span>");    $("p:first").html("<span>" + text + "</span>");    $("span").click(function () {      $(this).css("background-color","yellow");    });
 * @param {String} name The name of the property to set.
 * @param {String} name The name of the property to set.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.css = function(name){return new Object()};

/**
 * Get the current offset of the first matched element relative to the viewport.The returned object contains two<a href='Types#Integer'>Integer</a> properties, top and left. The method works only with visible elements. * @code $("*", document.body).click(function (e) {      var offset = $(this).offset();      e.stopPropagation();      $("#result").text(this.tagName + " coords ( " + offset.left + ", " +                                      offset.top + " )");    });
 * @type Object{top|left}
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.offset = function(){return new Object()};

/**
 * Gets the top and left position of an element relative to its offset parent.The returned object contains two<a href='Types#Integer'>Integer</a> properties, top and left. For accurate calculations make sure to use pixel values for margins, borders and padding. This method only works with visible elements. * @code var p = $("p:first");var position = p.position();$("p:last").text( "left: " + position.left + ", top: " + position.top );
 * @type Object{top|left}
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.position = function(){return new Object()};

/**
 * Gets the scroll top offset of the first matched element.This method works for both visible and hidden elements. * @code var p = $("p:first");$("p:last").text( "scrollTop:" + p.scrollTop() );
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.scrollTop = function(){return new Object()};

/**
 * When a value is passed in, the scroll top offset is set to that value on all matched elements.This method works for both visible and hidden elements. * @code $("div.demo").scrollTop(300);
 * @param {Number} val A positive number representing the desired scroll top offset.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.scrollTop = function(val){return new Object()};

/**
 * Gets the scroll left offset of the first matched element.This method works for both visible and hidden elements. * @code var p = $("p:first");$("p:last").text( "scrollLeft:" + p.scrollLeft() );
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.scrollLeft = function(){return new Object()};

/**
 * When a value is passed in, the scroll left offset is set to that value on all matched elements.This method works for both visible and hidden elements. * @code $("div.demo").scrollLeft(300);
 * @param {Number} val A positive number representing the desired scroll left offset.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.scrollLeft = function(val){return new Object()};

/**
 * Get the current computed, pixel, height of the first matched element.In jQuery 1.2, this method is able to find the height of the window and document. * @code function showHeight(ele, h) {      $("div").text("The height for the " + ele +                     " is " + h + "px.");    }    $("#getp").click(function () {       showHeight("paragraph", $("p").height());     });    $("#getd").click(function () {       showHeight("document", $(document).height());     });    $("#getw").click(function () {       showHeight("window", $(window).height());     });
 * @type Integer
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.height = function(){return new Object()};

/**
 * Set the CSS height of every matched element.If no explicit unit was specified (like 'em' or '%') then "px" is concatenated to the value. * @code $("div").one('click', function () {      $(this).height(30)             .css({cursor:"auto", backgroundColor:"green"});    });
 * @param {String, Number} val Set the CSS 'height' property to the specified value.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.height = function(){return new Object()};

/**
 * Get the current computed, pixel, width of the first matched element.In jQuery 1.2, this method is able to find the width of the window and document. * @code function showWidth(ele, w) {      $("div").text("The width for the " + ele +                     " is " + w + "px.");    }    $("#getp").click(function () {       showWidth("paragraph", $("p").width());     });    $("#getd").click(function () {       showWidth("document", $(document).width());     });    $("#getw").click(function () {       showWidth("window", $(window).width());     });
 * @type Integer
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.width = function(){return new Object()};

/**
 * Set the CSS width of every matched element.If no explicit unit was specified (like 'em' or '%') then "px" is concatenated to the value. * @code $("div").one('click', function () {      $(this).width(30)             .css({cursor:"auto", "background-color":"blue"});    });
 * @param {String, Number} val Set the CSS 'width' property to the specified value.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.width = function(){return new Object()};

/**
 * Gets the inner height (excludes the border and includes the padding) for the first matched element.This method works for both visible and hidden elements. * @code var p = $("p:first");$("p:last").text( "innerHeight:" + p.innerHeight() );
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.innerHeight = function(){return new Object()};

/**
 * Gets the inner width (excludes the border and includes the padding) for the first matched element.This method works for both visible and hidden elements. * @code var p = $("p:first");$("p:last").text( "innerWidth:" + p.innerWidth() );
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.innerWidth = function(){return new Object()};

/**
 * Gets the offsetHeight (includes the border and padding by default) for the first matched element.This method works for both visible and hidden elements. * @code var p = $("p:first");$("p:last").text( "outerHeight:" + p.outerHeight() + " , outerHeight(true):" + p.outerHeight(true) );
 * @param {Options} options A set of key/value pairs that configure the outerHeight method. All options are optional.
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.outerHeight = function(options){return new Object()};

/**
 * Get the outer width (includes the border and padding by default) for the first matched element.This method works for both visible and hidden elements. The margin can be included by passing an options map with margin set to true. * @code var p = $("p:first");$("p:last").text( "outerWidth:" + p.outerWidth()+ " , outerWidth(true):" + p.outerWidth(true) );
 * @param {Options} options A set of key/value pairs that configure the outerWidth method. All options are optional.
 * @type Integer
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.outerWidth = function(options){return new Object()};

/**
 * Binds a function to be executed whenever the DOM is ready to be traversed and manipulated.<p>This is probably the most important function included in the event module, as it can greatly improve the response times of your web applications.</p><p>In a nutshell, this is a solid replacement for using window.onload, and attaching a function to that. By using this method, your bound function will be called the instant the DOM is ready to be read and manipulated, which is when what 99.99% of all JavaScript code needs to run.</p><p>There is one argument passed to the ready event handler: A reference to the jQuery function. You can name that argument whatever you like, and can therefore stick with the $ alias without risk of naming collisions.</p><p>Please ensure you have no code in your <body> onload event handler, otherwise $(document).ready() may not fire.</p><p>You can have as many $(document).ready events on your page as you like. The functions are then executed in the order they were added.</p> * @code $(function() {  // Your code here...});
 * @param {Function} fn The function to be executed when the DOM is ready.<pre>function callback(jQueryReference) {  this; // document}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ready = function(fn){return new Object()};

/**
 * Binds a handler to one or more events (like click) for each matched element. Can also bind custom events.'''Possible event values:''' <code>blur</code>, <code>focus</code>, <code>load</code>, <code>resize</code>, <code>scroll</code>, <code>unload</code>, <code>click</code>, <code>dblclick</code>, <code> mousedown</code>, <code>mouseup</code>, <code>mousemove</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mouseenter</code>, <code>mouseleave</code>, <code>change</code>, <code>select</code>, <code> submit</code>, <code>keydown</code>, <code>keypress</code>, <code>keyup</code>, <code>error</code> The event handler is passed an event object that you can use to prevent default behaviour. To stop both default action and event bubbling, your handler has to return false. Note that this will prevent handlers on parent elements from running but not other jQuery handlers on the same element. In most cases, you can define your event handlers as anonymous functions (see first example). In cases where that is not possible, you can pass additional data as the second parameter (and the handler function as the third), see second example. * @code $("p").bind("myCustomEvent", function(e, myName, myValue){      $(this).text(myName + ", hi there!");      $("span").stop().css("opacity", 1)               .text("myName = " + myName)               .fadeIn(30).fadeOut(1000);    });    $("button").click(function () {      $("p").trigger("myCustomEvent", [ "John" ]);    });
 * @param {String} type One or more event types separated by a space
 * @param {String} type One or more event types separated by a space
 * @param {String} type One or more event types separated by a space
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.bind = function(type, data, fn){return new Object()};

/**
 * Binds a handler to one or more events to be executed <i>once</i> for each matched element.<p>The handler is executed only once for each element. Otherwise, the same rules as described in<a href='Events/bind'>bind</a> () apply. The event handler is passed an event object that you can use to prevent default behaviour. To stop both default action and event bubbling, your handler should return false.</p><p>In most cases, you can define your event handlers as anonymous functions (see first example). In cases where that is not possible, you can pass additional data as the second paramter (and the handler function as the third), see second example.</p> * @code $("p").one("click", function(){  alert( $(this).text() );});
 * @param {String} type An event type
 * @param {String} type An event type
 * @param {String} type An event type
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.one = function(type, data, fn){return new Object()};

/**
 * Trigger a type of event on every matched element.<p>This will also cause the default action of the browser with the same name (if one exists) to be executed. For example, passing 'submit' to the trigger() function will also cause the browser to submit the form. This default action can be prevented by returning false from one of the functions bound to the event.</p><p>If a native event is triggered and a suitable event object is not passed as the first element of 'data', then a fake event object is added before all supplied 'data' arguments. This element contains appropriate 'type' and 'target' fields and null-op 'preventDefault' and 'stopPropagation' methods, but none of the clientXY/pageXY/keyCode fields specific to mouse and keyboard events. A "suitable" event object is judged by the presence of the 'preventDefault' field.</p><p>You can also trigger custom events registered with bind.</p><p>You can add a '''!''' in event type to trigger events without namespace.</p> * @code $("p").bind("myEvent", function (event, message1, message2) {  alert(message1 + ' ' + message2);});$("p").trigger("myEvent", ["Hello","World!"]);
 * @param {String} type  An event type to trigger.
 * @param {String} type  An event type to trigger.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.trigger = function(type, data){return new Object()};

/**
 * This particular method triggers all bound event handlers on an element (for a specific event type) WITHOUT executing the browsers default actions.The event is only triggered on the first element within the JQuery collection. This method returns the return value of the triggered handler instead of a chainable JQuery object. Also, if the JQuery collection is empty, this method returns 'undefined' instead of an empty JQuery collection. * @code $("#old").click(function(){      $("input").trigger("focus");    });    $("#new").click(function(){      $("input").triggerHandler("focus");    });    $("input").focus(function(){      $("<span>Focused!</span>").appendTo("body").fadeOut(1000);    });
 * @param {String} type  An event type to trigger.
 * @param {String} type  An event type to trigger.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.triggerHandler = function(type, data){return new Object()};

/**
 * This does the opposite of bind, it removes bound events from each of the matched elements.<p>Without any arguments, all bound events are removed.</p><p>You can also unbind custom events registered with bind.</p><p>If the type is provided, all bound events of that type are removed.</p><p>If the function that was passed to bind is provided as the second argument, only that specific event handler is removed.</p> * @code var foo = function () {  // code to handle some kind of event}; * $("p").bind("click", foo); // ... now foo will be called when paragraphs are clicked ... * $("p").unbind("click", foo); // ... foo will no longer be called.
 * @param {String} type  An event type to unbind.
 * @param {String} type  An event type to unbind.
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.unbind = function(type, fn){return new Object()};

/**
 * Simulates hovering (moving the mouse on, and off, an object). This is a custom method which provides an 'in' to a frequent task.Whenever the mouse cursor is moved over a matched element, the first specified function is fired. Whenever the mouse moves off of the element, the second specified function fires. Additionally, checks are in place to see if the mouse is still within the specified element itself (for example, an image inside of a div), and if it is, it will continue to 'hover', and not move out (a common error in using a mouseout event handler). * @code $("td").unbind('mouseenter mouseleave');
 * @param {Function} over The function to fire when the mouse is moved over a matched element.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @param {Function} over The function to fire when the mouse is moved over a matched element.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.hover = function(over, out){return new Object()};

/**
 * Toggle among two or more function calls every other click.<p>Whenever a matched element is clicked, the first specified function is fired, when clicked again, the second is fired, and so on. All subsequent clicks continue to rotate through the functions.</p><p>Use unbind("click") to remove the toggle event.</p> * @code $("td").toggle(  function () {    $(this).addClass("selected");  },  function () {    $(this).removeClass("selected");  });
 * @param {Function} fn The function to execute.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @param {Function} fn The function to execute.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @param {Function} fn The function to execute.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.toggle = function(fn, fn2, fn3,fn4, fn5, fn6, fn7, fn8, fn9, fn10){return new Object()};

/**
 * Triggers the blur event of each matched element.This causes all of the functions that have been bound to that blur event to be executed, and calls the browser's default blur action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the blur event. The blur event usually fires when an element loses focus either via the pointing device or by tabbing navigation * @code $("p").blur();
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.blur = function(){return new Object()};

/**
 * Bind a function to the blur event of each matched element.The blur event fires when an element loses focus either via the pointing device or by tabbing navigation. * @code $("p").blur( function () { alert("Hello World!"); } );
 * @param {Function} fn A function to bind to the blur event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.blur = function(fn){return new Object()};

/**
 * Triggers the change event of each matched element.This causes all of the functions that have been bound to that change event to be executed, and calls the browser's default change action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the change event. The change event usually fires when a control loses the input focus and its value has been modified since gaining focus. * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.change = function(){return new Object()};

/**
 * Binds a function to the change event of each matched element.The change event fires when a control loses the input focus and its value has been modified since gaining focus. * @code $("input[@type='text']").change( function() {  // check input ($(this).val()) for validity here});
 * @param {Function} fn A function to bind to the change event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.change = function(fn){return new Object()};

/**
 * Triggers the click event of each matched element.Causes all of the functions that have been bound to that click event to be executed. * @code $("p").click();
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.click = function(){return new Object()};

/**
 * Binds a function to the click event of each matched element.The click event fires when the pointing device button is clicked over an element. A click is defined as a mousedown and mouseup over the same screen location. The sequence of these events is:<ul><li>mousedown</li><li>mouseup</li><li>click</li></ul> * @code $("p").click(function () {       $(this).slideUp();     });    $("p").hover(function () {      $(this).addClass("hilite");    }, function () {      $(this).removeClass("hilite");    });
 * @param {Function} fn A function to bind to the click event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.click = function(fn){return new Object()};

/**
 * Triggers the dblclick event of each matched element.This causes all of the functions that have been bound to that dblclick event to be executed, and calls the browser's default dblclick action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the dblclick event. The dblclick event usually fires when the pointing device button is double clicked over an element. * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.dblclick = function(){return new Object()};

/**
 * Binds a function to the dblclick event of each matched element.The dblclick event fires when the pointing device button is double clicked over an element * @code var divdbl = $("div:first");    divdbl.dblclick(function () {       divdbl.toggleClass('dbl');     });
 * @param {Function} fn The function to bind to the dblclick event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.dblclick = function(fn){return new Object()};

/**
 * Triggers the error event of each matched element.This causes all of the functions that have been bound to that error event to be executed, and calls the browser's default error action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the error event. The error event usually fires when an element loses focus either via the pointing device or by tabbing navigation. * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.error = function(){return new Object()};

/**
 * Binds a function to the error event of each matched element.<p>There is no public standard for the error event. In most browsers, the window object's error event is triggered when a JavaScript error occurs on the page. An image object's error event is triggered when it is set an invalid src attribute - either a non-existent file, or one with corrupt image data.</p><p>If the event is thrown by the window object, the event handler will be passed three parameters: <ol><li>A message describing the event ("varName is not defined", "missing operator in expression", etc.),</li><li>the full URL of the document containing the error, and</li><li>the line number on which the error occured.</li></ol></p> <p>If the event handler returns true, it signifies that the event was handled, and the browser raises no errors.</p><p>For more information, see: <ul><li>[http://msdn2.microsoft.com/en-us/library/ms536930.aspx msdn - onerror Event]</li><li>[http://developer.mozilla.org/en/docs/DOM:window.onerror Gecko DOM Reference - onerror Event]</li><li>[http://developer.mozilla.org/en/docs/DOM:event Gecko DOM Reference - Event object]</li><li>[http://en.wikipedia.org/wiki/DOM_Events Wikipedia: DOM Events]</ul></p> * @code $("img").error(function(){  $(this).hide();});
 * @param {Function} fn An event handler function to bind to the error event.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.error = function(fn){return new Object()};

/**
 * Triggers the focus event of each matched element.This causes all of the functions that have been bound to the focus event to be executed. Note that this does not execute the focus method of the underlying elements. * @code $(document).ready(function(){  $("#login").focus();});
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.focus = function(){return new Object()};

/**
 * Binds a function to the focus event of each matched element.The focus event fires when an element receives focus either via the pointing device or by tab navigation. * @code $("input[@type=text]").focus(function(){  $(this).blur();});
 * @param {Function} fn A function to bind to the focus event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.focus = function(fn){return new Object()};

/**
 * Triggers the keydown event of each matched element.This causes all of the functions that have been bound to the keydown event to be executed, and calls the browser's default keydown action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the keydown event. The keydown event usually fires when a key on the keyboard is pressed. * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keydown = function(){return new Object()};

/**
 * Bind a function to the keydown event of each matched element.The keydown event fires when a key on the keyboard is pressed. * @code $(window).keydown(function(event){  switch (event.keyCode) {    // ...    // different keys do different things    // Different browsers provide different codes    // see here for details: http://unixpapa.com/js/key.html        // ...  }});
 * @param {Function} fn A function to bind to the keydown event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keydown = function(fn){return new Object()};

/**
 * Triggers the keypress event of each matched element.This causes all of the functions that have been bound to the keypress event to be executed, and calls the browser's default keypress action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the keypress event. The keypress event usually fires when a key on the keyboard is pressed. * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keypress = function(){return new Object()};

/**
 * Binds a function to the keypress event of each matched element.The keypress event fires when a key on the keyboard is "clicked". A keypress is defined as a keydown and keyup on the same key. The sequence of these events is: <ul><li>keydown</li><li>keypress</li><li>keyup</li></ul> * @code $("input").keypress(function (e) {      if (e.which == 32 || (65 <= e.which && e.which <= 65 + 25)                        || (97 <= e.which && e.which <= 97 + 25)) {        var c = String.fromCharCode(e.which);        $("p").append($("<span/>"))              .children(":last")              .append(document.createTextNode(c));      } else if (e.which == 8) {        // backspace in IE only be on keydown        $("p").children(":last").remove();      }      $("div").text(e.which);    });
 * @param {Function} fn A function to bind to the keypress event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keypress = function(fn){return new Object()};

/**
 * Triggers the keyup event of each matched element.This causes all of the functions that have been bound to the keyup event to be executed, and calls the browser's default keyup action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the keyup event. The keyup event usually fires when a key on the keyboard is released. * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keyup = function(){return new Object()};

/**
 * Bind a function to the keyup event of each matched element.The keyup event fires when a key on the keyboard is released. * @code $(document).keyup(function(event){    if (event.keyCode == 27) {        alert('escaped!');    }});
 * @param {Function} fn A function to bind to the keyup event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.keyup = function(fn){return new Object()};

/**
 * Binds a function to the load event of each matched element.When bound to the window element, the event fires when the user agent finishes loading all content within a document, including window, frames, objects and images. For elements, it fires when the target element and all of its content has finished loading. Note: load will work only if you set it before the element has completely loaded, if you set it after that nothing will happen. This doesn't happen in $(document).ready(), which jQuery handles it to work as expected, also when setting it after the DOM has loaded. * @code $(window).load(function () {      // run code    });
 * @param {Function} fn A function to bind to the load event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.load  = function(fn){return new Object()};

/**
 * Binds a function to the mousedown event of each matched element.The mousedown event fires when the pointing device button is pressed over an element. * @code $("p").mouseup(function(){      $(this).append('<span style="color:#F00;">Mouse up.</span>');    }).mousedown(function(){      $(this).append('<span style="color:#00F;">Mouse down.</span>');    });
 * @param {Function} fn A function to bind to the mousedown event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.mousedown  = function(fn){return new Object()};

/**
 * Bind a function to the mousemove event of each matched element.The mousemove event fires when the pointing device is moved while it is over an element. The event handler is passed one variable - the event object. Its .clientX and .clientY properties represent the coordinates of the mouse. * @code $("div").mousemove(function(e){      var pageCoords = "( " + e.pageX + ", " + e.pageY + " )";      var clientCoords = "( " + e.clientX + ", " + e.clientY + " )";      $("span:first").text("( e.pageX, e.pageY ) - " + pageCoords);      $("span:last").text("( e.clientX, e.clientY ) - " + clientCoords);    });
 * @param {Function} fn A function to bind to the mousmove event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.mousemove = function(fn){return new Object()};

/**
 * Bind a function to the mouseout event of each matched element.The mouseout event fires when the pointing device is moved away from an element. * @code var i = 0;    $("div.overout").mouseout(function(){      $("p:first",this).text("mouse out");      $("p:last",this).text(++i);    }).mouseover(function(){      $("p:first",this).text("mouse over");    }); *     var n = 0;    $("div.enterleave").bind("mouseenter",function(){      $("p:first",this).text("mouse enter");    }).bind("mouseleave",function(){      $("p:first",this).text("mouse leave");      $("p:last",this).text(++n);    });
 * @param {Function} fn A function to bind to the mouseout event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.mouseout = function(fn){return new Object()};

/**
 * Bind a function to the mouseover event of each matched element.The mouseover event fires when the pointing device is moved onto an element. * @code var i = 0;    $("div.overout").mouseover(function(){      $("p:first",this).text("mouse over");      $("p:last",this).text(++i);    }).mouseout(function(){      $("p:first",this).text("mouse out");    }); *     var n = 0;    $("div.enterleave").bind("mouseenter",function(){      $("p:first",this).text("mouse enter");      $("p:last",this).text(++n);    }).bind("mouseleave",function(){      $("p:first",this).text("mouse leave");    });
 * @param {Function} fn A function to bind to the mouseover event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.mouseover = function(fn){return new Object()};

/**
 * Bind a function to the mouseup event of each matched element.The mouseup event fires when the pointing device button is released over an element. * @code $("p").mouseup(function(){      $(this).append('<span style="color:#F00;">Mouse up.</span>');    }).mousedown(function(){      $(this).append('<span style="color:#00F;">Mouse down.</span>');    });
 * @param {Function} fn A function to bind to the mouseup event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.mouseup = function(fn){return new Object()};

/**
 * Bind a function to the resize event of each matched element.The resize event fires when a document view is resized * @code $(window).resize(function(){  alert("Stop it!");});
 * @param {Function} fn A function to bind to the resize event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.resize = function(fn){return new Object()};

/**
 * Bind a function to the scroll event of each matched element.The scroll event fires when a document view is scrolled. * @code $("p").clone().appendTo(document.body);    $("p").clone().appendTo(document.body);    $("p").clone().appendTo(document.body);    $(window).scroll(function () {       $("span").css("display", "inline").fadeOut("slow");     });
 * @param {Function} fn A function to bind to the scroll event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.scroll = function(fn){return new Object()};

/**
 * Trigger the select event of each matched element.This causes all of the functions that have been bound to that select event to be executed, and calls the browser's default select action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the select event. Note: Do not confuse the "select" event with the "<a href='Events/change'>change</a> " event, which is the one triggered when an html "select" element is having its selected option modified by the user. * @code $("input").select();
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.select = function(){return new Object()};

/**
 * Bind a function to the select event of each matched element.The select event fires when a user selects some text in a text field, including input and textarea. * @code $(document).select( function () {       $("div").text("Something was selected").show().fadeOut(1000);     });
 * @param {Function} fn A function to bind to the select event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.select = function(fn){return new Object()};

/**
 * Trigger the submit event of each matched element.This causes all of the functions that have been bound to that submit event to be executed, and calls the browser's default submit action on the matching element(s). This default action can be prevented by returning false from one of the functions bound to the submit event. * @code $("form:first").submit();
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.submit = function(){return new Object()};

/**
 * Bind a function to the submit event of each matched element.The select event fires when a form is submitted * @code $("form").submit( function () {  return this.some_flag_variable;} );
 * @param {Function} fn A function to bind to the submit event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.submit = function(fn){return new Object()};

/**
 * Binds a function to the unload event of each matched element. *  * @code $(window).unload( function () { alert("Bye now!"); } );
 * @param {Function} fn function to bind to the unload event on each of the matched elements.<pre>function callback(eventObject) {  this; // dom element}</pre>
 * @type jQuery
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.unload = function(fn){return new Object()};

/**
 * Displays each of the set of matched elements if they are hidden.Same as<a href='Effects/show#speedcallback'>show( speed, [callback] )</a> without animations. Doesn't change anything if the selected elements are all visible. It doesn't matter if the element is hidden via a hide() call, or via a display:none in a stylesheet. * @code $("p").show()
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.show = function(){return new Object()};

/**
 * Show all matched elements using a graceful animation and firing an optional callback after completion.The height, width, and opacity of each of the matched elements are changed dynamically according to the specified speed. * @code function doIt() {      $("span,div").show("normal");    }    $("button").click(doIt); // can pass in function name    $("form").submit(function () {      if ($("input").val() == "yes") {        $("p").show(4000, function () {          $(this).text("Ok, DONE! (now showing)");        });      }      $("span,div").hide("normal");      return false; // to stop the submit    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.show = function(callback){return new Object()};

/**
 * Hides each of the set of matched elements if they are shown.Same as<a href='Effects/hide#speedcallback'>hide( speed, [callback] )</a> without animations. Doesn't change anything if the selected elements are all hidden. * @code $("p").hide();    $("a").click(function () {      $(this).hide();      return false;    });
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.hide = function(){return new Object()};

/**
 * Hide all matched elements using a graceful animation and firing an optional callback after completion.The height, width, and opacity of each of the matched elements are changed dynamically according to the specified speed. * @code for (var i = 0; i < 5; i++) {      $("<div>").appendTo(document.body);    }    $("div").click(function () {      $(this).hide(2000, function () {        $(this).remove();      });    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.hide = function(callback){return new Object()};

/**
 * Toggles displaying each of the set of matched elements.If they are shown, toggle makes them hidden. If they are hidden, toggle makes them shown. * @code $("button").click(function () {      $("p").toggle();    });
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.toggle = function(){return new Object()};

/**
 * Reveal all matched elements by adjusting their height and firing an optional callback after completion.Only the height is adjusted for this animation, causing all matched elements to be revealed in a "sliding" manner. * @code $("div").click(function () {      $(this).css({ borderStyle:"inset", cursor:"wait" });      $("input").slideDown(1000,function(){        $(this).css("border", "2px red inset")               .filter(".middle")                 .css("background", "yellow")                 .focus();        $("div").css("visibility", "hidden");      });    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.slideDown = function(callback){return new Object()};

/**
 * Hide all matched elements by adjusting their height and firing an optional callback after completion.Only the height is adjusted for this animation, causing all matched elements to be hidden in a "sliding" manner. * @code $("button").click(function () {      $(this).parent().slideUp("slow", function () {        $("#msg").text($("button", this).text() + " has completed.");      });    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.slideUp = function(callback){return new Object()};

/**
 * Toggle the visibility of all matched elements by adjusting their height and firing an optional callback after completion.Only the height is adjusted for this animation, causing all matched elements to be hidden or shown in a "sliding" manner. * @code $("#aa").click(function () {      $("div:not(.still)").slideToggle("slow", function () {        var n = parseInt($("span").text(), 10);        $("span").text(n + 1);      });    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.slideToggle = function(callback){return new Object()};

/**
 * Fade in all matched elements by adjusting their opacity and firing an optional callback after completion.Only the opacity is adjusted for this animation, meaning that all of the matched elements should already have some form of height and width associated with them. * @code $("a").click(function () {      $("div").fadeIn(3000, function () {        $("span").fadeIn(100);      });      return false;    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "def", or "fast") or the number of milliseconds to run the animation (e.g. 1000).  As of jQuery 1.2.6, "normal" or any other string works the same as "def" (400ms).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "def", or "fast") or the number of milliseconds to run the animation (e.g. 1000).  As of jQuery 1.2.6, "normal" or any other string works the same as "def" (400ms).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.fadeIn = function(callback){return new Object()};

/**
 * Fade out all matched elements by adjusting their opacity and firing an optional callback after completion.Only the opacity is adjusted for this animation, meaning that all of the matched elements should already have some form of height and width associated with them. * @code $("span").click(function () {      $(this).fadeOut(1000, function () {        $("div").text("'" + $(this).text() + "' has faded!");        $(this).remove();      });    });    $("span").hover(function () {      $(this).addClass("hilite");    }, function () {      $(this).removeClass("hilite");    });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.fadeOut = function(callback){return new Object()};

/**
 * Fade the opacity of all matched elements to a specified opacity and firing an optional callback after completion.Only the opacity is adjusted for this animation, meaning that all of the matched elements should already have some form of height and width associated with them. * @code var getPos = function (n) {      return (Math.floor(n) * 90) + "px";    };    $("p").each(function (n) {      var r = Math.floor(Math.random() * 3);      var tmp = $(this).text();      $(this).text($("p:eq(" + r + ")").text());      $("p:eq(" + r + ")").text(tmp);      $(this).css("left", getPos(n));    });    $("div").each(function (n) {                  $(this).css("left", getPos(n));                })            .css("cursor", "pointer")            .click(function () {                  $(this).fadeTo(250, 0.25, function () {                        $(this).css("cursor", "")                               .prev().css({"font-weight": "bolder",                                            "font-style": "italic"});                      });                });
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @param {String, Number } speed A string representing one of the three predefined speeds ("slow", "normal", or "fast") or the number of milliseconds to run the animation (e.g. 1000).
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.fadeTo = function(callback){return new Object()};

/**
 * A function for making custom animations.The key aspect of this function is the object of style properties that will be animated, and to what end. Each key within the object represents a style property that will also be animated (for example: "height", "top", or "opacity"). Note that properties should be specified using camel case, e.g. "marginLeft" instead of "margin-left." The value associated with the key represents to what end the property will be animated. If a number is provided as the value, then the style property will be transitioned from its current state to that new number. Otherwise if the string "hide", "show", or "toggle" is provided, a default animation will be constructed for that property. Only properties that take numeric values are supported (e.g. backgroundColor is not supported). As of jQuery 1.2 you can now animate properties by em and % (where applicable). Additionally, in jQuery 1.2, you can now do relative animations - specifying a "''+=''" or "''-=''" in front of the property value moves the element positively or negatively, relative to its current position. * @code $("p").animate({      "opacity": "show"    }, "slow", "easein");
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.animate = function(params, callback){return new Object()};

/**
 * A function for making custom animations.The key aspect of this function is the object of style properties that will be animated, and to what end. Each key within the object represents a style property that will also be animated (e.g. "height", "top", or "opacity"). Note that properties should be specified using camel case, e.g. "marginLeft" instead of "margin-left." The value associated with the key represents to what end the property will be animated. If a number is provided as the value, then the style property will be transitioned from its current state to that new number. Otherwise if the string "hide", "show", or "toggle" is provided, a default animation will be constructed for that property. * @code $("p").animate({       height:200, width:400, opacity: .5    }, 1000, "linear", function(){alert("all done");} );
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @param {Options} params A set of style attributes that you wish to animate, and to what end.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.animate = function(params){return new Object()};

/**
 * Stops all the currently running animations on all the specified elements.If any animations are queued to run, then they will begin immediately. * @code // Start animation    $("#go").click(function(){      $(".block").animate({left: '+=100px'}, 2000);    }); *     // Stop animation when button is clicked    $("#stop").click(function(){      $(".block").stop();    }); *     // Start animation in the opposite direction    $("#back").click(function(){      $(".block").animate({left: '-=100px'}, 2000);    });
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.stop = function(){return new Object()};

/**
 * Returns a reference to the first element's queue (which is an array of functions). *  * @code $("#show").click(function () {      var n = $("div").queue("fx");      $("span").text("Queue length is: " + n.length);    });    function runIt() {      $("div").show("slow");      $("div").animate({left:'+=200'},2000);      $("div").slideToggle(1000);      $("div").slideToggle("fast");      $("div").animate({left:'-=200'},1500);      $("div").hide("slow");      $("div").show(1200);      $("div").slideUp("normal", runIt);    }    runIt();
 * @type Array<Function>
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.queue = function(){return new Object()};

/**
 * Adds a new function, to be executed, onto the end of the queue of all matched elements. *  * @code $(document.body).click(function () {      $("div").show("slow");      $("div").animate({left:'+=200'},2000);      $("div").queue(function () {        $(this).addClass("newcolor");        $(this).dequeue();      });      $("div").animate({left:'-=200'},500);      $("div").queue(function () {        $(this).removeClass("newcolor");        $(this).dequeue();      });      $("div").slideUp();    });
 * @param {Function} callback The function to add to the queue.<pre>function callback() {  this; // dom element  // to continue the queue you must call  jQuery(this).dequeue();}</pre>
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.queue = function(callback){return new Object()};

/**
 * Replaces the queue of all matched element with this new queue (the array of functions). *  * @code $("#start").click(function () {      $("div").show("slow");      $("div").animate({left:'+=200'},5000);      $("div").queue(function () {        $(this).addClass("newcolor");        $(this).dequeue();      });      $("div").animate({left:'-=200'},1500);      $("div").queue(function () {        $(this).removeClass("newcolor");        $(this).dequeue();      });      $("div").slideUp();    });    $("#stop").click(function () {      $("div").queue("fx", []);      $("div").stop();    });
 * @param {Array<Function>} queue The queue to replace all the queues with.  The functions have the same parameters and this value as queue(callback).
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.queue = function(queue){return new Object()};

/**
 * Removes a queued function from the front of the queue and executes it. *  * @code $("button").click(function () {      $("div").animate({left:'+=200px'}, 2000);      $("div").animate({top:'0px'}, 600);      $("div").queue(function () {        $(this).toggleClass("red");        $(this).dequeue();      });      $("div").animate({left:'10px', top:'30px'}, 700);    });
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.dequeue = function(){return new Object()};

/**
 * Load a remote page using an HTTP request.This is jQuery's low-level AJAX implementation. See $.get, $.post etc. for higher-level abstractions that are often easier to understand and use, but don't offer as much functionality (such as error callbacks). $.ajax() returns the XMLHttpRequest that it creates. In most cases you won't need that object to manipulate directly, but it is available if you need to abort the request manually. $.ajax() takes one argument, an object of key/value pairs, that are used to initialize and handle the request. See below for a full list of the key/values that can be used. '''Note:''' If you specify the dataType option described below, make sure the server sends the correct MIME type in the response (eg. xml as "text/xml"). Sending the wrong MIME type can lead to unexpected problems in your script. See<a href='Specifying_the_Data_Type_for_AJAX_Requests'>Specifying the Data Type for AJAX Requests</a> for more information. '''Note:''' All remote (not on the same domain) POST requests are converted to GET when 'script' is the dataType (because it loads script using a DOM script tag). As of jQuery 1.2, you can load JSON data located on another domain if you specify a [http://bob.pythonmac.org/archives/2005/12/05/remote-json-jsonp/ JSONP] callback, which can be done like so: "myurl?callback=?". jQuery automatically replaces the ? with the correct method name to call, calling your specified callback. Or, if you set the dataType to "jsonp" a callback will be automatically added to your Ajax request. * @code var xmlDocument = [create xml document]; $.ajax({   url: "page.php",   processData: false,   data: xmlDocument,   success: handleResponse });
 * @param {Options} options A set of key/value pairs that configure the Ajax request. All options are optional. A default can be set for any option with <a href='Ajax/jQuery.ajaxSetup'>$.ajaxSetup</a>().
 * @type XMLHttpRequest
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajax = function(options){return new Object()};

/**
 * Load HTML from a remote file and inject it into the DOM.A GET request will be performed by default - but if you pass in any extra parameters then a POST will occur. In jQuery 1.2 you can now specify a jQuery selector in the URL. Doing so will filter the incoming HTML document, only injecting the elements that match the selector. The syntax looks something like "url #some > selector". See the examples for more information. * @code $("#feeds").load("feeds.php", {limit: 25}, function(){   alert("The last 25 entries in the feed have been loaded"); });
 * @param {String} url The URL of the HTML page to load.
 * @param {String} url The URL of the HTML page to load.
 * @param {String} url The URL of the HTML page to load.
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.load = function(url, data, callback){return new Object()};

/**
 * Load a remote page using an HTTP GET request.This is an easy way to send a simple GET request to a server without having to use the more complex $.ajax function. It allows a single callback function to be specified that will be executed when the request is complete (and only if the response has a successful response code). If you need to have both error and success callbacks, you may want to use $.ajax. * @code $.get("test.cgi", { name: "John", time: "2pm" },   function(data){     alert("Data Loaded: " + data);   });
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @type XMLHttpRequest
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.get = function(url, data, callback, type){return new Object()};

/**
 * Load JSON data using an HTTP GET request.As of jQuery 1.2, you can load JSON data located on another domain if you specify a [http://bob.pythonmac.org/archives/2005/12/05/remote-json-jsonp/ JSONP] callback, which can be done like so: "myurl?callback=?". jQuery automatically replaces the ? with the correct method name to call, calling your specified callback. Note: Keep in mind, that lines after this function will be executed before callback. * @code var id=$("#id").attr("value");  $.getJSON("pages.php",{id:id},dates);function dates(datos){	 $("#list").html("Name:"+datos[1].name+"<br>"+"Last Name:"+datos[1].lastname+"<br>"+"Address:"+datos[1].address);}
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @type XMLHttpRequest
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.getJSON = function(url, data, callback){return new Object()};

/**
 * Loads, and executes, a local JavaScript file using an HTTP GET request.Before jQuery 1.2, getScript was only able to load scripts from the same domain as the original page. As of 1.2, you can now load JavaScript files from any domain. Warning: Safari 2 and older is unable to evaluate scripts in a global context synchronously. If you load functions via getScript, make sure to call them after a delay. * @code $.getScript("test.js", function(){   alert("Script loaded and executed."); });
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @type XMLHttpRequest
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.getScript = function(url, callback){return new Object()};

/**
 * Load a remote page using an HTTP POST request.This is an easy way to send a simple POST request to a server without having to use the more complex $.ajax function. It allows a single callback function to be specified that will be executed when the request is complete (and only if the response has a successful response code). The returned data format can be specified by the fourth parameter. If you need to have both error and success callbacks, you may want to use $.ajax. $.post is a (simplified) wrapper function for $.ajax. * @code $.post("test.php", { func: "getNameAndTime" },   function(data){     alert(data.name); // John     console.log(data.time); //  2pm   }, "json");
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @param {String} url The URL of the page to load.
 * @type XMLHttpRequest
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.post = function(url, data, callback, type){return new Object()};

/**
 * Attach a function to be executed whenever an AJAX request completes. This is an<a href='Ajax_Events'>Ajax Event</a> .The XMLHttpRequest and settings used for that request are passed as arguments to the callback. * @code $("#msg").ajaxComplete(function(request, settings){   $(this).append("<li>Request Complete.</li>"); });
 * @param {Function} callback The function to execute.<pre>function (event, XMLHttpRequest, ajaxOptions) {  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxComplete = function(callback){return new Object()};

/**
 * Attach a function to be executed whenever an AJAX request fails. This is an<a href='Ajax_Events'>Ajax Event</a> .The XMLHttpRequest and settings used for that request are passed as arguments to the callback. A third argument, an exception object, is passed if an exception occured while processing the request. * @code $("#msg").ajaxError(function(event, request, settings){   $(this).append("<li>Error requesting page " + settings.url + "</li>"); });
 * @param {Function} callback The function to execute.<pre>function (event, XMLHttpRequest, ajaxOptions, thrownError) {  // thrownError only passed if an error was caught  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxError = function(callback){return new Object()};

/**
 * Attach a function to be executed before an AJAX request is sent. This is an<a href='Ajax_Events'>Ajax Event</a> .The XMLHttpRequest and settings used for that request are passed as arguments to the callback. * @code $("#msg").ajaxSend(function(evt, request, settings){   $(this).append("<li>Starting request at " + settings.url + "</li>"); });
 * @param {Function} callback The function to execute.<pre>function (event, XMLHttpRequest, ajaxOptions) {  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxSend = function(callback){return new Object()};

/**
 * Attach a function to be executed whenever an AJAX request begins and there is none already active. This is an<a href='Ajax_Events'>Ajax Event</a> . *  * @code $("#loading").ajaxStart(function(){   $(this).show(); });
 * @param {Function} callback The function to execute.<pre>function () {  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxStart = function(callback){return new Object()};

/**
 * Attach a function to be executed whenever all AJAX requests have ended. This is an<a href='Ajax_Events'>Ajax Event</a> . *  * @code $("#loading").ajaxStop(function(){   $(this).hide(); });
 * @param {Function} callback The function to execute.<pre>function () {  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxStop = function(callback){return new Object()};

/**
 * Attach a function to be executed whenever an AJAX request completes successfully. This is an<a href='Ajax_Events'>Ajax Event</a> .The event object, XMLHttpRequest, and settings used for that request are passed as arguments to the callback. * @code $("#msg").ajaxSuccess(function(evt, request, settings){   $(this).append("<li>Successful Request!</li>"); });
 * @param {Function} callback The function to execute.<pre>function (event, XMLHttpRequest, ajaxOptions) {  this; // dom element listening}</pre>
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxSuccess = function(callback){return new Object()};

/**
 * Setup global settings for AJAX requests.See<a href='Ajax/jQuery.ajax'>$.ajax</a> for a description of all available options. * @code $.ajaxSetup({   url: "/xmlhttp/",   global: false,   type: "POST" }); $.ajax({ data: myData });
 * @param {Options} options A set of key/value pairs that configure the default Ajax request. All options are optional.
 * @type 
 * @since 1.1
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.ajaxSetup = function(options){return new Object()};

/**
 * Serializes a set of input elements into a string of data.Serialize is typically used to prepare user input data to be posted to a server. The serialized data is in a standard format that is compatible with almost all server side programming languages and frameworks. In order to work properly '''serialize requires that form fields have a name''' attribute. Having only an id will not work. Note the name attribute in this field: <input id="email" name="email" type="text" /> '''Versions''' As of jQuery 1.2 the serialize method correctly serializes forms. For older versions of jQuery, the [http://www.malsup.com/jquery/form/ Form Plugin's] fieldSerialize method should be used. * @code function showValues() {      var str = $("form").serialize();      $("#results").text(str);    } *     $(":checkbox, :radio").click(showValues);    $("select").change(showValues);    showValues();
 * @type jQuery
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.serialize = function(){return new Object()};

/**
 * Serializes all forms and form elements (like the<a href='Ajax/serialize'>.serialize()</a> method) but returns a JSON data structure for you to work with. *  * @code function showValues() {      var fields = $(":input").serializeArray();      $("#results").empty();      jQuery.each(fields, function(i, field){        $("#results").append(field.value + " ");      });    } *     $(":checkbox, :radio").click(showValues);    $("select").change(showValues);    showValues();
 * @type jQuery
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.serializeArray = function(){return new Object()};

/**
 * Contains flags for the useragent, read from navigator.userAgent.Available flags are: * safari * opera * msie * mozilla This property is available before the DOM is ready, therefore you can use it to add ready events only for certain browsers. There are situations where object detection is not reliable enough, in such cases it makes sense to use browser detection. A combination of browser and object detection yields quite reliable results. * @code jQuery.each(jQuery.browser, function(i) {   if($.browser.msie){      $("#div ul li").css("display","inline");   }else{      $("#div ul li").css("display","inline-table");   } });
 * @type Map
 * @property 
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.browser = new Object();

/**
 * The version number of the rendering engine for the user's browser.Here are some typical results: * Internet Explorer: 6.0, 7.0 * Mozilla/Firefox/Flock/Camino: 1.7.12, 1.8.1.3, 1.9 * Opera: 9.20 * Safari/Webkit: 312.8, 418.9 * @code if (jQuery.browser.msie) {  alert(parseInt(jQuery.browser.version));}
 * @type String
 * @property 
 * @since 1.1.3
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.browser.prototype.version = new Object();

/**
 * States if the current page, in the user's browser, is being rendered using the [http://www.w3.org/TR/REC-CSS2/box.html W3C CSS Box Model]. *  * @code $.boxModel
 * @type Boolean
 * @property 
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.boxModel = new Object();

/**
 * A generic iterator function, which can be used to seamlessly iterate over both objects and arrays.This function is not the same as<a href='Core/each'>$().each()</a> - which is used to iterate, exclusively, over a jQuery object. This function can be used to iterate over anything. The callback has two arguments:the key (objects) or index (arrays) as the first, and the value as the second. If you wish to break the each() loop at a particular iteration you can do so by making your function return false. Returning non-false is the same as a <code>continue</code> statement in a for loop, it will skip immediately to the next iteration. * @code $.each( { name: "John", lang: "JS" }, function(i, n){   alert( "Name: " + i + ", Value: " + n ); });
 * @param {Object} object The object or array to iterate over.
 * @param {Object} object The object or array to iterate over.
 * @type Object
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.each = function(object, callback){return new Object()};

/**
 * Extend one object with one or more others, returning the original, modified, object.If no target is specified, the JQuery namespace itself is extended. This can be useful for plugin authors wishing to add new methods to JQuery. If a boolean true is specified as the first argument, JQuery performs a deep copy, recursively copying any objects it finds. Otherwise, the copy will share structure with the original object(s). Undefined properties are not copied. However, properties inherited from the object's prototype ''will'' be copied over. * @code var empty = {}var defaults = { validate: false, limit: 5, name: "foo" };var options = { validate: true, name: "bar" };var settings = $.extend(empty, defaults, options);
 * @param {Object} target The object to extend.
 * @param {Object} target The object to extend.
 * @param {Object} target The object to extend.
 * @type Object
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.extend = function(target, object1, objectN){return new Object()};

/**
 * Filter items out of an array, by using a filter function.The filter function will be passed two arguments: The current array item and its index. The filter function must return 'true' to keep the item in the array. * @code $.grep( [0,1,2], function(n,i){   return n > 0; });
 * @param {Array} array The Array to find items in.
 * @param {Array} array The Array to find items in.
 * @param {Array} array The Array to find items in.
 * @type Array
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.grep = function(array, callback, invert){return new Object()};

/**
 * Turns anything into a true array.Typically it will be unnecessary to use this function if you are using jQuery which uses this function internally. * @code var arr = jQuery.makeArray(document.getElementsByTagName("div"));    arr.reverse(); // use an Array method on list of dom elements    $(arr).appendTo(document.body);
 * @param {Object} obj Anything to turn in to an actual Array.
 * @type Array
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.makeArray = function(obj){return new Object()};

/**
 * Translate all items in an array to another array of items.The translation function that is provided to this method is called for each item in the array and is passed two arguments: The item to be translated, and its index within the array. The function can then return the translated value, 'null' (to remove the item), or an array of values - which will be flattened into the full array. * @code $.map( [0,1,2,3], function (a) { return a * a; } );
 * @param {Array} array The Array to translate.
 * @param {Array} array The Array to translate.
 * @type Array
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.map = function(array, callback){return new Object()};

/**
 * Determine the index of the first parameter in the Array (-1 if not found). *  * @code var arr = [ 4, "Pete", 8, "John" ]; *     $("span:eq(0)").text(jQuery.inArray("John", arr));    $("span:eq(1)").text(jQuery.inArray(4, arr));    $("span:eq(2)").text(jQuery.inArray("David", arr));
 * @param {Any} value Value to see if it exists in the array.
 * @param {Any} value Value to see if it exists in the array.
 * @type Number
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.inArray = function(value, array){return new Object()};

/**
 * Merge two arrays together. Removing all duplicates is removed in jQuery 1.1.3The result is the altered first argument with the elements from the second array added. To remove duplicate elements from the resulting array, use $.unique(). * @code $.merge( [3,2,1], [4,3,2] )
 * @param {Array} first The first array to merge, the elements of second added.
 * @param {Array} first The first array to merge, the elements of second added.
 * @type Array
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.merge = function(first, second){return new Object()};

/**
 * Remove all duplicate elements from an array of elements. *  * @code $.unique(document.getElementsByTagName("div"));
 * @param {Array} array The Array to translate.
 * @type Array
 * @since 1.1.3
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.unique = function(array){return new Object()};

/**
 * Determine if the parameter passed is a function. *  * @code $.isFunction(function(){});
 * @param {Object} obj Object to test whether or not it is a function.
 * @type boolean
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.isFunction = function(obj){return new Object()};

/**
 * Remove the whitespace from the beginning and end of a string.Uses a regular expression to remove whitespace from the given string. * @code $.trim("  hello, how are you?  ");
 * @param {String} str The string to trim.
 * @type String
 * @since 1.0
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.trim = function(str){return new Object()};

/**
 * Returns a unique ID for the element.Typically this function will only be used internally. It is called automatically when necessary when using the other data() functionality. * @code $(document.body).click(function(e) {      var id = jQuery.data(e.target);      $("span").text(id);    });
 * @param {Element} elem DOM element of interest.
 * @type Number
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.data = function(elem){return new Object()};

/**
 * Returns value at named data store for the element. *  * @code $("button").click(function(e) {      var adiv = $("div").get(0);      var value; *       switch ($("button").index(this)) {        case 0 :          value = jQuery.data(adiv, "blah");          break;        case 1 :          jQuery.data(adiv, "blah", "hello");          value = "Stored!";          break;        case 2 :          jQuery.data(adiv, "blah", 86);          value = "Stored!";          break;        case 3 :          jQuery.removeData(adiv);          value = "Removed!";          break;      } *       $("span").text("" + value);    });
 * @param {Element} elem DOM element of interest.
 * @param {Element} elem DOM element of interest.
 * @type Any
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.data = function(elem, name){return new Object()};

/**
 * Stores the value in the named spot and also returns the value.This function can be useful for attaching data to elements without having to create a new expando. It also isn't limited to a string. The value can be any format. To avoid conflicts in plugins, it is usually effective to store one object using the plugin name and put all the necessary information in that object. <code> var obj = jQuery.data($("#target").get(0), "pluginname", {}); obj[...] = ... </code> * @code var adiv = $("div").get(0);    jQuery.data(adiv, "test", { first: 16, last: "pizza!" });    $("span:first").text(jQuery.data(adiv, "test").first);    $("span:last").text(jQuery.data(adiv, "test").last);
 * @param {Element} elem DOM element of interest.
 * @param {Element} elem DOM element of interest.
 * @param {Element} elem DOM element of interest.
 * @type Any
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.data = function(elem, name, value){return new Object()};

/**
 * Remove the expando attribute that allows data storage on an element.This is the complement function to jQuery.data(elem) which is called as necessary by jQuery.data(elem, name, value). * @code var adiv = $("div").get(0); *     $("span:eq(0)").text("" + jQuery.data(adiv, "test1"));    jQuery.data(adiv, "test1", "VALUE-1");    jQuery.data(adiv, "test2", "VALUE-2");    $("span:eq(1)").text("" + jQuery.data(adiv, "test1"));    jQuery.removeData(adiv);    $("span:eq(2)").text("" + jQuery.data(adiv, "test1"));    $("span:eq(3)").text("" + jQuery.data(adiv, "test2"));
 * @param {Element} elem Element to delete the data store from.
 * @type 
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.removeData = function(elem){return new Object()};

/**
 * Removes just this one named data store.This is the complement function to jQuery.data(elem, name, value). * @code var adiv = $("div").get(0); *     $("span:eq(0)").text("" + jQuery.data(adiv, "test1"));    jQuery.data(adiv, "test1", "VALUE-1");    jQuery.data(adiv, "test2", "VALUE-2");    $("span:eq(1)").text("" + jQuery.data(adiv, "test1"));    jQuery.removeData(adiv, "test1");    $("span:eq(2)").text("" + jQuery.data(adiv, "test1"));    $("span:eq(3)").text("" + jQuery.data(adiv, "test2"));
 * @param {Element} elem Element to delete the named data store property from.
 * @param {Element} elem Element to delete the named data store property from.
 * @type 
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.removeData = function(elem, name){return new Object()};

/**
 * Serializes an array of form elements or an object (core of<a href='Ajax/serialize'>.serialize()</a> method). *  * @code var params = { width:1680, height:1050 };    var str = jQuery.param(params);    $("#results").text(str);
 * @param {Array<Elements>, jQuery, Object} obj An Array or jQuery object is serialized by name/value pairs.  An object by key/value pairs.
 * @type String
 * @since 1.2
 * @compat=IE6|IE7|FF1|FF2|FF3|OPERA|SAFARI2|SAFARI3|KONQ 
 */
jQuery.prototype.param = function(){return new Object()};