
# SlothPlugin

Sloth to świetny plugin na twój serwer. Dzięki module konfiguracji, będzie działał tak, jak TY chcesz.

# Spis Treści

1. [Dokumentacja](#dokumentacja)
    1. [Instalacja](#instalacja)
    2. [Konfiguracja](#konfiguracja)
    3. [Komendy](#komendy)
3. [Pomoc](#pomoc)
2. [Licencja](#licencja)

# Dokumentacja

## Instalacja

Aby zainstalować plugin wejdź w folder plugin/versions a nastepnie wybierz wersję. Na razie dostępna jest tylko wersja 1.16.5

W folderze znajdziesz plik jar - pobierz go

Aby zamocować plugin na swoim serwerze wklej plik jar w folder plugins na swoim hostingu

Plik jar możesz również uzyskać z naszej strony https://maksiooo.github.io/SlothPlugin/website/



## Konfiguracja

Kiedy pierwszy raz odpalisz plugin na swoim serwerze stworzy się folder `SlothPlugin`

Wejdź w ten folder, pojawią się wtedy 2 pliki: `config.yml` oraz `pluginconfig.yml`

Wejdź w plik `pluginconfig.yml`, wyświetli ci się mnóstwo możliwości, oczywiście możesz je edytować

Teraz czas na twoją wyobraźnię. Skonfiguruj plugin jak chcesz, do własnych potrzeb.


Wyjaśnienia każdej opcji w pliku `pluginconfig.yml`:

& `JoinMessage` - Wiadomość do wyświetlania kiedy ktoś dołączy na serwer.

& `LeaveMessage` - Wiadomość do wyświetlania kiedy ktoś wyjdzie z serwera.

& `StrikeCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `strike`

& `TntCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `tnt`

& `CraftingCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `crafting`

& `FeedCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `feed`

& `FlyOnCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `fly` i opcja lotu zostanie **włączona**

& `FlyOffCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `fly` i opcja lotu zostanie **wyłączona**

& `GodOnCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `god` i opcja god zostanie **włączona**

& `GodOffCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `god` i opcja god zostanie **wyłączona**

& `HealCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `heal`

& `DayCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `day`

& `NightCommandMessage` - Wiadomość do wyświetlania gdy zostanie wykonana komenda `night`

`MissingPermissionsMessage` - Wiadomość do wyświetlania gdy użytkownik nie będzie miał permisji do wykonania komendy

& `Discord` - Serwer disord twojego serwera

& `TeamSpeak` - Serwer teamspeak twojego serwera

& `Youtube` - Kanał youtube twojego serwera

Aby zapisać konfiguracje bez przeładowywania serwera, użyj komendy `reloadconfig` (Komendę możesz wywołać tylko przez konsolę)


Legenda:

`&` - Możesz użyć [formatowania tekstu](https://minecraft.fandom.com/pl/wiki/Kody_formatowania). 

Przykład: `JoinMessage: '&lWitaj na serwerze '`


# Komendy

`heal` - Ulecz się

Wymagane permisje: `slothplugin.heal`

`feed` - Spraw aby twój pasek głodu był pełny

Wymagane permisje: `slothplugin.feed`

`god` - Ustaw tryb god

Wymagane permisje: `slothplugin.god`

`fly` - Włącz możliwość latania

Wymagane permisje: `slothplugin.fly`

`crafting` - Otwórz crafting table

Wymagane permisje: `slothplugin.crafting`

`strike` - Zespawnuj błyskawicę

Wymagane permisje: `slothplugin.strike`

`reloadconfig` - Przeładuj pliki konfiguracji

Wymagane permisje: Komenda możliwa do wywołania **tylko przez konsolę**

`tnt` - Zespawnuj tnt

Wymagane permisje: `slothplugin.tnt`

`day` - Ustaw Dzień

Wymagane permisje: `slothplugin.day`

`night` - Ustaw Noc

Wymagane permisje: `slothplugin.night`

`discord` - Wyświetl serwer discord serwera

Wymagane permisje: Brak wymaganych permisji

`teamspeak` - Wyświetl serwer teamspeak serwera

Wymagane permisje: Brak wymaganych permisji

`youtube` - Wyświetl kanał youtube serwera

Wymagane permisje: Brak wymaganych permisji

# Pomoc

Indywidualną pomoc możesz uzyskać na naszym serwerze discord.

# Licencja

Cały kod podlega licencji Apache-2.0
