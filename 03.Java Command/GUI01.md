# GUI

#### 1. Set a frame

```java
package com.LILRICH.lesson1;

import java.awt.*;

public class Frame01 {
    public static void main(String[] args) {
        Frame frame = new Frame("First GUI");
        //set window size
        frame.setSize(400,400);

        //location of window
        frame.setLocation(200,200);

        //background color
        frame.setBackground(new Color(80,150,70));

        //make window un-resizeable
        frame.setResizable(false);

        //make window visible
        frame.setVisible(true);
    }
}

```

#### 2.You can also encapsulate the frame package like this way

```java
package com.LILRICH.lesson1;
import java.awt.*;

public class Frame02 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.yellow);
        MyFrame myFrame2 = new MyFrame(200,100,200,200,Color.gray);
    }
}
class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x, int y, int w, int d, Color color){
        super("+ window"+(++id));
        setBackground(color);
        setBounds(x,y,w,d);
        setVisible(true);
    }

}
```

#### 3. Set panel 

```java
package com.LILRICH.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);
        //frame
        frame.setBounds(200,200,500,500);
        frame.setBackground(new Color(40,161,35));

        //panel
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(172, 130, 24, 255));

        //add panel
        frame.add(panel);
        frame.setVisible(true);

        //close the window

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
```

#### 4. Set layout (3 types)

- **Flow Layout**

```java
package com.LILRICH.lesson1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //component-button
        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");

        //set flow layout - center, left, right
//        frame.setLayout(new FlowLayout()); // default center
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        frame.setSize(200,200);
        frame.setVisible(true);
        //add button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}

```

- **Border Layout - east, west, south, north, center**

```java 
package com.LILRICH.lesson1;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");

        Button east = new Button("East");
        Button west = new Button("West");
        Button north = new Button("North");
        Button south = new Button("South");
        Button center = new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setVisible(true);


    }
}

```

- **GridLayout**

```java
package com.LILRICH.lesson1;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,2));
        for (int i = 0; i < 4; i++) {
            frame.add(new Button("Button"+(i+1)));
        }
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
```

