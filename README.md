# android
### 实习8(1)-Actionbar_Toolbar控件
#### 1）	显示大标题、小标题，Overflow菜单中有三个子菜单。 Done
#### 2）	点击右上侧的overflow图标，菜单显示下下面，不要覆盖Toolbar区域。Done
1. 设置兼容模式下的app:popupTheme="@style/OverflowMenuStyle"
2. <item name="overlapAnchor">false</item>
3. <item name="android:colorBackground">@color/colorPrimary</item>
#### 3）	默认菜单项是不显示图标的，这里要求显示图标。 Done
1. setOptionalIconsVisible true
#### 4）	要求菜单项的背景颜色和Toolbar的背景颜色是一致的，toolbar上的文字颜色和菜单项的文字颜色是一致的。Done
1. android:background="?attr/colorPrimary"
2. android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
#### 5）	点击搜索按钮（放大镜），进入第二个页面。Done
1. menu item->search
2. onCreateOptionsMenu getMenuInflater().inflate(R.menu.toolbar, menu)
3. onOptionsItemSelected
#### 6）	第二个页面中Toolbar左边有一个“上一页”的箭头。点击箭头，回到左边的主页。Done
1. setDisplayHomeAsUpEnabled true
#### 7）	在介绍ActionBar时，我们介绍了ActionView。请在任一ToolBar上添加一个ActionBar按钮，并完成简单的相应。Done
1. menu item app:actionViewClass="android.widget.Button" 
2. 加载menu Button btn_test = (Button)menu.findItem(R.id.btn_test).getActionView();
3. 设置btn_test的内容、字体
#### 思考题：想想怎么让Toolbar中的标题居中显示？Done
1. 在android.support.v7.widget.Toolbar中套一个TextView 给TextView设置android:layout_gravity="center"
2. setTitle("")
