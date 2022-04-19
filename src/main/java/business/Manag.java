package business;

import business.*;
import data.FileWriterr;
import gui.GUI1;
import gui.GUI2;
import gui.GUI3;
import gui.GUI4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

public class Manag {

    private GUI1 gui1;
    private static GUI4 gui4;
    private DeliveryService deliveryService;
    private int currID;
    private ArrayList<BaseProduct> basp;
    private ArrayList<MenuItem> sl;

    public Manag()
    {
        this.gui1 = new GUI1();
        this.gui4 = new GUI4();
        this.deliveryService = new DeliveryService();
        this.gui1.setVisible(true);
        this.currID = -1;
        basp = new ArrayList<>();
        sl = new ArrayList<>();

        this.gui1.getJoinButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tp = gui1.getComboBox().getSelectedIndex();
                switch (tp)
                {
                    case 0:
                        try {
                            deliveryService.addAdmin(gui1.getJoinName().getText(),gui1.getJoinPass().getText(),Integer.parseInt(gui1.getJoinAge().getText()),gui1.getJoinEmail().getText());
                        } catch (Except except) {
                            except.printStackTrace();
                        }
                        break;

                    case 1:
                        try {
                            deliveryService.addClient(gui1.getJoinName().getText(),gui1.getJoinPass().getText(),Integer.parseInt(gui1.getJoinAge().getText()),gui1.getJoinEmail().getText());
                        } catch (Except except) {
                            except.printStackTrace();
                        }
                        break;

                    case 2:
                        try {
                            deliveryService.addEmployee(gui1.getJoinName().getText(),gui1.getJoinPass().getText(),Integer.parseInt(gui1.getJoinAge().getText()),gui1.getJoinEmail().getText());
                        } catch (Except except) {
                            except.printStackTrace();
                        }
                        break;

                    default:
                        try {
                            throw new Except("Inregistrare invalida");
                        } catch (Except except) {
                            except.printStackTrace();
                        }
                        break;

                }

            }
        });
        this.gui1.getEnterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = gui1.getEnterName().getText();
                String password = gui1.getEnterPass().getText();

                Identificator sd = deliveryService.logProtocol(name,password);
                if(sd.getID() == -1)
                {
                    try {
                        throw new Except("Cont invalid");
                    } catch (Except except) {
                        except.printStackTrace();
                    }
                }
                currID = sd.getID();
                switch (sd.getTypo())
                {
                    case 0: GUI2 admin = new GUI2(); //interfata de administrator
                        admin.setVisible(true);
                        gui1.setVisible(false);
                        admin.getBtnBack().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                admin.dispose();
                                gui1.setVisible(true);
                            }

                        });
                        admin.getAddSimpleProductButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                deliveryService.addBaseProduct(admin.getTitleAddSimpleText().getText(),
                                        Float.parseFloat(admin.getRatingAddSimpleText().getText()),
                                        Integer.parseInt(admin.getCaloriesAddSimpleText().getText()),
                                        Integer.parseInt(admin.getProteinAddSimpleText().getText()),
                                        Integer.parseInt(admin.getFatAddSimpleText().getText()),
                                        Integer.parseInt(admin.getSodiumAddSimpleText().getText()),
                                        Integer.parseInt(admin.getPriceAddSimpleText().getText()));

                                System.out.println(deliveryService.getMen().size());

                            }
                        });
                        admin.getPutOnListButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                BaseProduct ls = deliveryService.bsProd(admin.getProductTitleAddMenu().getText());
                                if(ls == null)
                                    try {
                                        throw new Except("Nu exista produs");
                                    } catch (Except except) {
                                        except.printStackTrace();
                                    }
                                else
                                    basp.add(ls);
                                ls.com();
                            }
                        });
                        admin.getAddMenuButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int price = 0;
                                for(BaseProduct i: basp)
                                {
                                    price+=i.getPrice();
                                }
                                deliveryService.addCompusProduct(admin.getTitleAddMenuText().getText(),price,basp);
                                basp.clear();
                            }
                        });
                        admin.getEditButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                deliveryService.modify(admin.getProductNameEditText().getText(),
                                        admin.getTitleEditText().getText(),
                                        Float.parseFloat(admin.getRatingEditText().getText()),
                                        Integer.parseInt(admin.getCaloriesEditText().getText()),
                                        Integer.parseInt(admin.getProteinEditText().getText()),
                                        Integer.parseInt(admin.getFatEditText().getText()),
                                        Integer.parseInt(admin.getSodiumEditText().getText()),
                                        Integer.parseInt(admin.getPriceEditText().getText()));

                            }
                        });
                        admin.getDeleteButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                deliveryService.del(admin.getProductNameDeleteText().getText());
                            }
                        });
                        admin.getBtnImportProducts().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    deliveryService.importProd();
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        admin.getMakeReport1Button().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int hour1 = Integer.parseInt(admin.getStartReport1Text().getText());
                                int hour2 = Integer.parseInt(admin.getEndReport1Text().getText());
                                try {
                                    deliveryService.raport1(hour1,hour2);
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        admin.getMakeReport2Button().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int times = Integer.parseInt(admin.getReport2Text().getText());
                                try {
                                    deliveryService.raport2(times);
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        admin.getMakeReport3Button().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    deliveryService.raport3(Integer.parseInt(admin.getTimesReport3Text().getText()));
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        admin.getMakeReport4Button().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    deliveryService.raport4(Integer.parseInt(admin.getDayReport4Text().getText()));
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        break;

                    case 1: GUI3 gui3 = new GUI3();
                        gui3.setVisible(true);
                        gui1.setVisible(false);
                        gui3.getBtnBack().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gui3.dispose();
                                gui1.setVisible(true);
                            }
                        });
                        gui3.getShowAllButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    FileWriterr.show(deliveryService.getMen());
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                }
                            }
                        });
                        gui3.getSearchButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                deliveryService.serc(gui3.getTitleSearchText().getText(),Float.parseFloat(gui3.getRatingSearchText().getText()),
                                        Integer.parseInt(gui3.getCaloriesSearchText().getText()),Integer.parseInt(gui3.getProteinSearchText().getText()),
                                        Integer.parseInt(gui3.getFatSearchText().getText()),Integer.parseInt(gui3.getSodiumSearchText().getText()),
                                        Integer.parseInt(gui3.getPriceSearchText().getText()));
                            }
                        });
                        gui3.getPutOnListOrderButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                deliveryService.getPro(gui3.getTitleProductOrderText().getText()).com();
                                sl.add(deliveryService.getPro(gui3.getTitleProductOrderText().getText()));
                            }
                        });
                        gui3.getCreateButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                int price = 0;
                                for(int i=0;i<sl.size();i++)
                                    price+= sl.get(i).getPrice();

                                deliveryService.addOrder(price,sl);
                                sl.clear();
                                Client cl = deliveryService.getCli(currID);
                                cl.ord();

                            }
                        });

                        break;

                    case 2: //interfata de angajat

                        gui4.setVisible(true);
                        gui1.setVisible(false);

                        gui4.getBackButton().addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gui4.setVisible(false);
                                gui1.setVisible(true);
                            }
                        });
                        break;

                    default:
                        try {
                            throw new Except("Logarea nu a functionat");
                        } catch (Except except) {
                            except.printStackTrace();
                        }
                        break;
                }
            }
        });
        this.gui1.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                deliveryService.serializare();
            }
        });
    }
    public static GUI4 getObse()
    {
        return gui4;
    }

}
