# android
### 实习8(1)-Actionbar_Toolbar控件
#### 1）	显示大标题、小标题，Overflow菜单中有三个子菜单。 Done
#### 2）	点击右上侧的overflow图标，菜单显示下下面，不要覆盖Toolbar区域。Done
设置兼容模式下的app:popupTheme="@style/OverflowMenuStyle"
<item name="overlapAnchor">false</item>
<item name="android:colorBackground">@color/colorPrimary</item>
#### 3）	默认菜单项是不显示图标的，这里要求显示图标。 Done
setOptionalIconsVisible true
#### 4）	要求菜单项的背景颜色和Toolbar的背景颜色是一致的，toolbar上的文字颜色和菜单项的文字颜色是一致的。Done

#### 5）	点击搜索按钮（放大镜），进入第二个页面。Done
menu item->search
onCreateOptionsMenu getMenuInflater().inflate(R.menu.toolbar, menu)
onOptionsItemSelected
#### 6）	第二个页面中Toolbar左边有一个“上一页”的箭头。点击箭头，回到左边的主页。Done
#### 7）	在介绍ActionBar时，我们介绍了ActionView。请在任一ToolBar上添加一个ActionBar按钮，并完成简单的相应。Done

#### 思考题：想想怎么让Toolbar中的标题居中显示？Done
